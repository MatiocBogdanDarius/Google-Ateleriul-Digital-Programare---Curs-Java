package curs06.collections.challenge2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            getPascalTriangle(6).forEach(line -> {
                line.forEach(number -> System.out.print(number + " "));
                System.out.println();
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            getPascalTriangle(0).forEach(line -> {
                line.forEach(number -> System.out.print(number + " "));
                System.out.println();
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static List<List<Integer>> getPascalTriangle(int n) throws Exception{
        if(n < 1){
            throw new Exception("Can not generate pascal triangle for non positive value");
        }
        if(n == 1){

            return List.of(List.of(1));
        }
        List<List<Integer>> pascalTriangle = new ArrayList<>(getPascalTriangle(n - 1));
        List<Integer> lastLineOfNMinus1Triangle = pascalTriangle.get(pascalTriangle.size() - 1);
        List<Integer> newLine = new ArrayList<>();
        newLine.add(1);
        for (int i = 0; i < lastLineOfNMinus1Triangle.size() - 1; i++){
            newLine.add(lastLineOfNMinus1Triangle.get(i) + lastLineOfNMinus1Triangle.get(i + 1));
        }
        newLine.add(1);
        pascalTriangle.add(newLine);
        return pascalTriangle;
    }
}
