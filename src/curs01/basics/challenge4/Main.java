package curs01.basics.challenge4;

import curs01.basics.challenge3.PairOf2;

import java.util.*;

public class Main {
    private static List<PairOf2> createPairs(List<Integer> list) {
        List<PairOf2> pairs = new ArrayList<>();
        //todo implement method
        return pairs;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(-1,-1,-1,2));
        List<PairOf2> pairs1 = createPairs(list1);
        System.out.println(list1);
        pairs1.forEach(System.out::println);
    }
}