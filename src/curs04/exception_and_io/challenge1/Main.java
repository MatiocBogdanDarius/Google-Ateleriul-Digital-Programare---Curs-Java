package curs04.exception_and_io.challenge1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("phone.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                String[] inputData = myReader.nextLine().split(" ");
                String name = inputData[0];
                String phoneNumber = inputData[1];
                if(name.equals("Abbey") || name.equals("Abdul")){
                    System.out.println(phoneNumber);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
