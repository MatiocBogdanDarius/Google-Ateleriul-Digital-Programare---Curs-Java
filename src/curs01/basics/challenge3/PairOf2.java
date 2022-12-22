package curs01.basics.challenge3;

public class PairOf2 {
    private int value1;
    private int value2;

    public PairOf2(int v1, int v2){
        value1 = v1;
        value2 = v2;
    }

    @Override

    public String toString(){
        return "[" + value1 + "," + value2 + "]" ;
    }

}
