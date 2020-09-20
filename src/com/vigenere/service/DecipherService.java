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

        for(int i = 1; i <= MAX_KEY_SIZE; i++) {

            var listinha = new ArrayList<Double>();

            for(int k = 0; k < i; k++) {
                var alphabetFrequency = new HashMap<Character, Integer>();
                var pulo = 0;
                for (int j = k; j < textSize; j = j + i) {
                    pulo = i;
                    var key = text.charAt(j);

                    alphabetFrequency.merge(key, 1, Integer::sum);
                }
                var divisao = pulo;
                var listx = alphabetFrequency.values()
                        .stream()
                        .map(a -> indexCoincidence.calculate(a, textSize / divisao))
                        .collect(toList());

                listinha.add(indexCoincidence.calculate(listx));
            }
            averageKey.put(i, indexCoincidence.calculate(listinha) / listinha.size());
        }

        return findKey(averageKey);
    }

    //https://www.sanfoundry.com/java-program-implement-vigenere-cypher/
    public String decrypt(String text, String key) {
        StringBuilder res = new StringBuilder();
        for (int i = 0, j = 0; i < text.length(); i++) {
            var c = text.charAt(i);
            if (c < 'a' || c > 'z')
                continue;
            res.append((char) ((c - key.charAt(j) + 26) % 26 + 'a'));
            j = ++j % key.length();
        }
        return res.toString();
    }

    private int findKey(HashMap<Integer, Double> averageKey) {
        double closestValue = calculateIndex(averageKey.get(1));
        int currentKey = 0;
        for(Integer key: averageKey.keySet()){
            var closeToLanguageIndex = calculateIndex(averageKey.get(key));
            if(closeToLanguageIndex < closestValue) {
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
            var textColumn = textService.quebrarEmStringPosicaoPorPosicao(dividedTextByKeySize, keySize, i);

            //juntar outras
            var chara = textService.findMostRecurringCharacter(textColumn);

            var teste = 0;
            if (i != 0 && i != keySize - 1) {
                teste = (alphabet.getIndex(chara) - alphabet.getIndex("e") + 26) % 26;
            } else {
                teste = (alphabet.getIndex(chara) - alphabet.getIndex("a") + 26) % 26;
            }

            var letra2 = alphabet.getLetter(teste);

            secretKey.append(letra2);
        }

        return secretKey.toString();
    }
}
