package curs05.generics.challenge5;

public class GenericBinarySearch<T> {
    private T[] array;
    private boolean isAscendingSorted;

    public GenericBinarySearch(T[] array) throws NotComparableTypeException, ArrayNotSortedException {
        if(!(array[0] instanceof Comparable)){
            throw new NotComparableTypeException();
        }
        getOrder(array);
        checkIfSorted(array);
        this.array = array;
    }
    public int search(T toFind){
        int lowerIndex = 0, higherIndex = array.length - 1;
        while (higherIndex - lowerIndex > 1) {
            int mid = (higherIndex + lowerIndex) / 2;
            if ((((Comparable<T>) array[mid]).compareTo(toFind) <= 0) == isAscendingSorted) {
                lowerIndex = mid + 1;
            }
            else {
                higherIndex = mid;
            }
        }
        if (array[lowerIndex] == toFind) {
            return lowerIndex;
        }
        else if (array[higherIndex] == toFind) {
            return lowerIndex;
        }
        else {
            return -1;
        }
    }

    private void getOrder(T[] array){
        int i = 0;
        for (; i < array.length - 1; i++){
            int order = ((Comparable<T>) array[i]).compareTo(array[i + 1]);
            if(order != 0){
                isAscendingSorted = order < 0;
                break;
            }
        }
        if(i == array.length - 1){
            isAscendingSorted = true;
        }
    }

    public void checkIfSorted(T[] array) throws ArrayNotSortedException {
        for (int i = 0; i < array.length - 1; i++){
            int order = ((Comparable<T>) array[i]).compareTo(array[i + 1]);
            if(isAscendingSorted != order <= 0){
                throw new ArrayNotSortedException();
            }
        }
    }
}
