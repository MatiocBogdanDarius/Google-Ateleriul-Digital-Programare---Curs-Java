package curs01.basics.challenge4;

public class PairOf3 {
    private int value1;
    private int value2;
    private int value3;

    public PairOf3(int value1, int value2, int value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    @Override
    public String toString() {
        return "[" + value1 + "," + value2 + "," + value3 + "]" ;
    }
}
