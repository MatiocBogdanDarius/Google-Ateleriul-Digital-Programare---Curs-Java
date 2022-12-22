package curs06.collections.challenge4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list01 = new ArrayList<>(List.of(4, 3, 7, 8, 6, 2, 1));
        List<Integer> list02 = new ArrayList<>(List.of(1, 4, 3, 2));
        zigZag(list01);
        zigZag(list02);
        System.out.println(list01);
        System.out.println(list02);
    }

    public static void zigZag(List<Integer> list){
        Collections.sort(list);
        System.out.println(list);
        for (int i = 1; i <= list.size() - 2; i += 2) {
            int temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }
}

