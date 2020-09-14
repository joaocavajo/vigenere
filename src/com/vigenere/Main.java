package com.vigenere;

import static java.util.stream.Collectors.toList;

import com.vigenere.model.Frequency;
import com.vigenere.service.IndexCoincidence;
import com.vigenere.service.PrinterService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var printer = new PrinterService();

        // descobre primeiro o tamanho da chave (parte mais hard)

        calcularIndiceTotalDoTexto(printer.getText());
        var index = new IndexCoincidence();


        /*
        Long wordsCount = Files.lines(Paths.get(file))
    .flatMap(str->Stream.of(str.split("[ ,.!?\r\n]")))
    .filter(s->s.length()>0).count();
System.out.println(wordsCount);
         */

    }

    public static double calcularIndiceTotalDoTexto(String text) {

        var lista = new ArrayList<Double>();
        var textSize = text.length();
        var index = new IndexCoincidence();
        var frequencyL = new Frequency();

        //quebrar em 7
        for(int j = 0/*1*/; j < 7; j++) {
            var alphabetFrequency2 = new HashMap<Character, Integer>();
            for (int i = j; i < textSize; i = i + 7) {

                    var key = text.charAt(i);
                //    for (char key : tex2.toCharArray()) {
                alphabetFrequency2.merge(key, 1, Integer::sum);
                //   }
            }
            var listx = alphabetFrequency2.values()
                    .stream()
                    .map(a -> index.calculate(a, textSize/7))
                    .collect(toList());

            lista.add(   index.calculate(listx));

        }
        //colocar
       // if (algum elemento da lista bater com a proximidade)
      var as = splitString(7, text);
      var q = frequencyL.getALPHABET().get(0 - 7);
//quebrar em 7
        //deslocar
     //  var sizefi = lista.stream().mapToDouble(Double::doubleValue).sum();




        // NÃO APAGAR DAQUI PRA BAIXO

    //    var index = new IndexCoincidence();

        var alphabetFrequency = new HashMap<Character, Integer>();
      //  var textSize = text.length();

        for (char key : text.toCharArray()) {
            alphabetFrequency.merge(key, 1, Integer::sum);
        }

        var printer = new PrinterService();

        printer.printFrequencies(alphabetFrequency);

        var list = alphabetFrequency.values()
                .stream()
                .map(a -> index.calculate(a, textSize))
                .collect(toList());

        var frequency = index.calculate(list);

        System.out.println();

//        Strings.asChars("xyz").forEach(c -> System.out.print(c));
//        asChars()().forEach(key -> {
//            map.merge(key, 1, Integer::sum);
//        });
//        text.toCharArray().
//        text.split("(?!^)").t
        return 0.0;
    }

    private static List<String> splitString(int interval, String str) {
        int length = str.length();
        var split = new ArrayList<String>();
        if(length < interval) {
            split.add(str);
        } else {
            for(int i=0;i<length;i+=interval) {
                int endIndex = i + interval;
                if(endIndex > length) {
                    endIndex = length;
                }
                String substring = str.substring(i, endIndex);
                split.add(substring);
            }
        }
        return split;
    }
}
