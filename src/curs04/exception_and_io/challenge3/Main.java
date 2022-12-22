package curs04.exception_and_io.challenge3;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("#########################################################################################");
        System.out.println("word_list.txt");
        System.out.println("#########################################################################################");
        getAnagrams("word_list.txt", "listen");
        System.out.println("#########################################################################################");
        System.out.println("words_alpha.txt");
        System.out.println("#########################################################################################");
        getAnagrams("words_alpha.txt", "listen");
    }

    public static void getAnagrams(String fromFilename, String forWord){
        try {
            FileReader fileReader = new FileReader(fromFilename);
            BufferedReader reader = new BufferedReader(fileReader);
            reader.lines()
                    .map(line -> line.split(" "))
                    .flatMap(Arrays::stream)
                    .filter(word -> isAnagramFor(word, forWord))
                    .forEach(System.out::println);

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isAnagramFor(String word, String reference) {
        if(word.length() != reference.length()) return false;
        for (int i = 0; i < reference.length(); i++){
            if(word.indexOf(reference.charAt(i)) == -1){
                return false;
            }
        }
        return true;
    }
}
