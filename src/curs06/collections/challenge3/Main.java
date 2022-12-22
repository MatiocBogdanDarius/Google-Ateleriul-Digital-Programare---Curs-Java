package curs06.collections.challenge3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            getBellTriangle(6).forEach(line -> {
                line.forEach(number -> System.out.print(number + " "));
                System.out.println();
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            getBellTriangle(0).forEach(line -> {
                line.forEach(number -> System.out.print(number + " "));
                System.out.println();
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static List<List<Integer>> getBellTriangle(int n) throws Exception{
        if(n < 1){
            throw new Exception("Can not generate bell triangle for non positive value");
        }
        if(n == 1){

            return List.of(List.of(1));
        }
        List<List<Integer>> bellTriangle = new ArrayList<>(getBellTriangle(n - 1));
        List<Integer> lastLineOfNMinus1Triangle = bellTriangle.get(bellTriangle.size() - 1);
        List<Integer> newLine = new ArrayList<>();
        newLine.add(lastLineOfNMinus1Triangle.get(lastLineOfNMinus1Triangle.size() - 1));
        for (int i = 0; i < lastLineOfNMinus1Triangle.size(); i++){
            newLine.add(lastLineOfNMinus1Triangle.get(i) + newLine.get(i));
        }
        bellTriangle.add(newLine);
        return bellTriangle;
    }
}
