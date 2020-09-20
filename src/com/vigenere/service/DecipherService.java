package com.vigenere.service;

import static java.lang.Math.abs;
import static java.util.stream.Collectors.toList;

import com.vigenere.model.Alphabet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DecipherService {

    private final IndexCoincidence indexCoincidence;
    private final Alphabet alphabet;
    private final TextService textService;

    public DecipherService(IndexCoincidence indexCoincidence, Alphabet alphabet, TextService textService) {
        this.indexCoincidence = indexCoincidence;
        this.alphabet = alphabet;
        this.textService = textService;
    }

    public int findKeySize(String text) {
        var textSize = text.length();

        var MAX_KEY_SIZE = 10;
        var averageKey = new HashMap<Integer, Double>();

        for (int i = 1; i <= MAX_KEY_SIZE; i++) {

            var averageFrequencies = new ArrayList<Double>();

            for (int k = 0; k < i; k++) {
                var alphabetFrequency = new HashMap<Character, Integer>();
                var position = 0;

                for (int j = k; j < textSize; j = j + i) {
                    position = i;
                    var key = text.charAt(j);
                    alphabetFrequency.merge(key, 1, Integer::sum);
                }

                var keyPosition = position;
                var positionFrequencies = alphabetFrequency.values()
                        .stream()
                        .map(a -> indexCoincidence.calculate(a, textSize / keyPosition))
                        .collect(toList());

                averageFrequencies.add(indexCoincidence.calculate(positionFrequencies));
            }
            averageKey.put(i, indexCoincidence.calculate(averageFrequencies) / averageFrequencies.size());
        }

        return findKey(averageKey);
    }

    /**
     * This method was found in
     * https://www.sanfoundry.com/java-program-implement-vigenere-cypher/
     */
    public String decrypt(String text, String key) {
        var decipheredText = new StringBuilder();
        for (int i = 0, j = 0; i < text.length(); i++) {
            var c = text.charAt(i);
            if (c < 'a' || c > 'z')
                continue;
            decipheredText.append((char) ((c - key.charAt(j) + 26) % 26 + 'a'));
            j = ++j % key.length();
        }
        return decipheredText.toString();
    }

    private int findKey(HashMap<Integer, Double> averageKey) {
        double closestValue = calculateIndex(averageKey.get(1));
        int currentKey = 0;
        for (Integer key : averageKey.keySet()) {
            var closeToLanguageIndex = calculateIndex(averageKey.get(key));
            if (closeToLanguageIndex < closestValue) {
                closestValue = closeToLanguageIndex;
                currentKey = key;
            }
        }

        return currentKey;
    }

    private double calculateIndex(double keyValue) {
        var frequency = alphabet.getFrequencyPT();
        return abs(frequency - keyValue);
    }

    public String findSecretKey(List<String> dividedTextByKeySize, int keySize) {
        var secretKey = new StringBuilder();

        for (int i = 0; i < keySize; i++) {
            var textColumn = textService.mergeColumn(dividedTextByKeySize, keySize, i);

            var recurredCharacter = textService.findMostRecurringCharacter(textColumn);

            var shiftedCharacter = 0;
            if (i != 0 && i != keySize - 1) {
                shiftedCharacter = (alphabet.getIndex(recurredCharacter) - alphabet.getIndex("e") + 26) % 26;
            } else {
                shiftedCharacter = (alphabet.getIndex(recurredCharacter) - alphabet.getIndex("a") + 26) % 26;
            }

            var realLetter = alphabet.getLetter(shiftedCharacter);
            secretKey.append(realLetter);
        }

        return secretKey.toString();
    }
}
