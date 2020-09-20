package com.vigenere.service;

public class PrinterService {

    public void printCipheredText(String text) {
        System.out.printf("The ciphered text is: %s.", text);
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
