package curs03.design_pattern.challenge2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,4,2,3,6,9,8,7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSort(), copy01OfArr);
        displaySorted(new MergeSort(), copy02OfArr);
    }

    private static void displaySorted(SortStrategy sortStrategy, Integer[] copy01OfArr) {
        System.out.println(sortStrategy.getClass().getSimpleName() + ":");
        sortStrategy.sort(copy01OfArr);
        System.out.println(Arrays.toString(copy01OfArr));
    }
}
