package com.vigenere.model;

import static java.util.Arrays.asList;

import java.util.List;

public class Alphabet {
    private final List<String> ALPHABET_PT =
            asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                    "t", "u", "v", "w", "x", "y", "z");

    public double getFrequencyPT() {
        return 0.072723;
    }

    public int getIndex(String letter) {
        return ALPHABET_PT.indexOf(letter);
    }

    public String getLetter(int index) {
        return ALPHABET_PT.get(index);
    }

}
