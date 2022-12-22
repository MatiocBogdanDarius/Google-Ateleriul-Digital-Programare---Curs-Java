package curs06.collections.challenge5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(merge(List.of(1, 5, 6), List.of(2, 3, 4)));
        System.out.println(merge(List.of(1, 5, 6, 7, 8, 9), List.of(2, 3, 4)));
    }

    public static List<Integer>  merge(List<Integer> list1, List<Integer> list2){
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                result.add(list1.get(i++));
            }
            else {
                result.add(list2.get(j++));
            }
        }
        if (i < list1.size()) {
            result.addAll(list1.subList(i, list1.size()));
        }
        else {
            result.addAll(list2.subList(i, list2.size()));
        }
        return result;
    }
}
