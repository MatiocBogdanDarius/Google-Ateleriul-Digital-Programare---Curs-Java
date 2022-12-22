package curs05.generics.challenge5;

import curs05.generics.challenge2.Running;

public class Main {
    public static void main(String[] args) {
        Integer[] array01 = new Integer[]{1,3,6,8,9,11};
        Integer[] array02 = new Integer[]{11,9,8,6,3,1};
        Integer[] array03 = new Integer[]{11,1,8,6,3,1};
        Running[] array04 = new Running[]{ new Running("RED", 41), new Running("RED", 41)};
        Integer toFind01 = 8;
        Integer toFind02 = 1;
        Integer toFind03 = 11;
        Integer toFind04 = 14;
        Running toFind05 = new Running("RED", 41);
        search(array01, toFind01);
        search(array01, toFind02);
        search(array01, toFind03);
        search(array01, toFind04);
        search(array02, toFind01);
        search(array02, toFind02);
        search(array02, toFind03);
        search(array02, toFind04);
        search(array03, toFind04);
        search(array04, toFind05);

    }

    public static <T> void search(T[] array, T toFind){
        try {
            int index = (new GenericBinarySearch<T>(array)).search(toFind);
            if(index == -1){
                System.out.println(toFind + " is not found!");
            }
            else {
                System.out.println(toFind + " is found at index: " + index);
            }
        } catch (NotComparableTypeException | ArrayNotSortedException e) {
            System.out.println(e.getMessage());
        }
    }
}
