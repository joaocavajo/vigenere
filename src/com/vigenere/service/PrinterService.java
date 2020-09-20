package com.vigenere.service;

import java.util.Map;

public class PrinterService {

    public void printCipheredText(String text) {
        System.out.printf("The ciphered text is: %s.", text);
    }

    public void printFrequencies(Map<Character, Integer> frequencies) {
        System.out.println("Frequency to each letter in the text: ");
        frequencies.forEach((key, value) -> System.out.printf("%s - %s\n", key, value));
    }

    public void printKeySize(int keySize) {
        System.out.printf("\nThe size of the key is %d.", keySize);
    }

    public void printFinalText(String text) {
        System.out.printf("\nThe deciphered text is: %s.", text);
    }

    public void printSecretKey(String secretKey) {
        System.out.printf("\nThe secret key is: %s.", secretKey);
    }
}
