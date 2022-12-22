package curs01.basics.challenge3;

import java.util.*;

public class Main {
    private static List<PairOf2> createPairs(List<Integer> list) {
        Map<Integer, Integer> numbersOccurrence =new HashMap<>();
        List<PairOf2> pairs = new ArrayList<>();
        for(Integer x : list){
            if(numbersOccurrence.containsKey(-x)){
                int occurrences = numbersOccurrence.get(-x);
                if(occurrences == 1){
                    numbersOccurrence.remove(-x);
                } else {
                    numbersOccurrence.put(-x , occurrences - 1);
                }

                pairs.add(new PairOf2(-x, x));
            } else {

                if(!numbersOccurrence.containsKey(x)){
                    numbersOccurrence.put(x, 1);
                } else {
                    int occurrences = numbersOccurrence.get(x) + 1;
                    numbersOccurrence.put(x, occurrences);
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3,2,-3,-2,3,0));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,0,-1,-1));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(5,9,-5,-7,-5));
        List<PairOf2> pairs1 = createPairs(list1);
        List<PairOf2> pairs2 = createPairs(list2);
        List<PairOf2> pairs3 = createPairs(list3);
        System.out.println(list1);
        pairs1.forEach(System.out::println);
        System.out.println("Number of pairs " + pairs1.size());
        System.out.println();
        System.out.println(list2);
        pairs2.forEach(System.out::println);
        System.out.println("Number of pairs " + pairs2.size());
        System.out.println();
        System.out.println(list3);
        pairs3.forEach(System.out::println);
        System.out.println("Number of pairs " + pairs3.size());
    }
}