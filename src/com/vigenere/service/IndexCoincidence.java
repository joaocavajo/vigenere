package com.vigenere.service;

import java.util.List;

public class IndexCoincidence {

    public double calculate(int occurrence, int textSize) {
        return (double) (occurrence * (occurrence - 1)) / (textSize * (textSize - 1));
    }

    public double calculate(List<Double> frequencies) {
        return frequencies.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }
}