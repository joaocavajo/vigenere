package com.vigenere.service;

import static java.lang.String.valueOf;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextService {

    public List<String> splitTextThroughKeySize(int keySize, String text) {
        int length = text.length();
        var split = new ArrayList<String>();
        if (length < keySize) {
            split.add(text);
        } else {
            for (int i = 0; i < length; i += keySize) {
                int endIndex = i + keySize;
                if (endIndex > length) {
                    endIndex = length;
                }
                var substring = text.substring(i, endIndex);
                split.add(substring);
            }
        }
        return split;
    }

    /**
     * This method was found in
     * https://www.w3resource.com/java-exercises/string/java-string-exercise-43.php
     */
    public String findMostRecurringCharacter(String textColumn) {
        var ctr = new int[textColumn.length()];
        int textSize = textColumn.length();
        for (int i = 0; i < textSize; i++)
            ctr[textColumn.charAt(i)]++;
        int max = -1;
        char recurredCharacter = ' ';

        for (int i = 0; i < textSize; i++) {
            if (max < ctr[textColumn.charAt(i)]) {
                max = ctr[textColumn.charAt(i)];
                recurredCharacter = textColumn.charAt(i);
            }
        }

        return valueOf(recurredCharacter);
    }

    public String quebrarEmStringPosicaoPorPosicao(List<String> lista, int keySize, int posicao) {
        return lista.stream()
                .map(l -> {
                    if (l.length() == keySize) {
                        return valueOf(l.charAt(posicao));
                    } else {
                        return "";
                    }
                })
                .collect(Collectors.joining(""));
    }


}
