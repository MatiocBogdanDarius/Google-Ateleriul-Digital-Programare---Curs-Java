package curs04.exception_and_io.challenge2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("message.txt");
            Scanner myReader = new Scanner(myObj);
            StringBuilder secretMessageBuilder = new StringBuilder();
            while (myReader.hasNextLine()){
                String line = myReader.nextLine();
                for (char letter : line.toCharArray()){
                    if (letter == 'X'){
                        secretMessageBuilder.append(" ");
                    } else if(letter >= 'A' && letter < 'Z'){
                        secretMessageBuilder.append(letter);
                    }
                }
            }
            System.out.println(secretMessageBuilder);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
