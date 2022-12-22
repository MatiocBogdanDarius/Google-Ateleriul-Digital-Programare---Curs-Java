package curs04.exception_and_io.challenge5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Word> words = getOccurrence("curs01_challenge5.txt");
        words.forEach(System.out::println);
    }

    public static List<Word> getOccurrence(String filename){
        List<Word> wordsList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader reader = new BufferedReader(fileReader);
            List<String> textFromFile = reader.lines()
                    .map(line -> line.split(" "))
                    .flatMap(Arrays::stream)
                    .toList();
            for(String wordFromFile : textFromFile){
                Word newWord = new Word(wordFromFile);
                if(!"?.!-".contains(newWord.getWord())){
                    int index = wordsList.indexOf(newWord);
                    if(index == -1){
                        wordsList.add(newWord);
                    } else {
                        wordsList.get(index).incrementOccurrence();
                    }
                }
            }
            Collections.sort(wordsList);
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return wordsList;
    }
}
