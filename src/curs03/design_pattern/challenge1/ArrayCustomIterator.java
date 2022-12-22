package curs03.design_pattern.challenge1;

public class ArrayCustomIterator {
    private int[] array;
    private int position;

    public ArrayCustomIterator(int[] array) {
        this.array = array;
        position = 0;
    }

    public boolean hasNext(){
        return position < array.length;
    }

    public int next(){
        return array[position++];
    }
}
