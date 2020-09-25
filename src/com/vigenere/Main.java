package com.vigenere;

import com.vigenere.model.Alphabet;
import com.vigenere.service.DecipherService;
import com.vigenere.service.FileService;
import com.vigenere.service.IndexCoincidence;
import com.vigenere.service.PrinterService;
import com.vigenere.service.TextService;

/**
 * @author João Vitor Brasil
 */
public class Main {

    public static void main(String[] args) {
        var file = new FileService();
        var text = file.readFile("cipher2.txt");

        var index = new IndexCoincidence();
        var alphabet = new Alphabet();

        vigenereDecipher(text, index, alphabet);
    }

    public static void vigenereDecipher(String text, IndexCoincidence index, Alphabet alphabet) {
        var textService = new TextService();
        var decipher = new DecipherService(index, alphabet, textService);
        var printer = new PrinterService();

        printer.printCipheredText(text);

        //find the key size used to cipher
        var keySize = decipher.findKeySize(text);
        printer.printKeySize(keySize);

        //break the text, which each line has the key size
        var dividedTextByKeySize = textService.splitTextThroughKeySize(keySize, text);

        //find in the secret key in the first line
        var secretKey = decipher.findSecretKey(dividedTextByKeySize, keySize);
        printer.printSecretKey(secretKey);

        //decipher the text
        var decipherText = decipher.decrypt(text, secretKey);

        printer.printFinalText(decipherText);
    }

}
