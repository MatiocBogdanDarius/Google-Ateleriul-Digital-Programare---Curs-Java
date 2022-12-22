package curs05.generics.challenge2;

public class Pair<T extends Shoe>{
    private T first;
    private T second;

    public Pair(T first, T second) throws SizesDoNotMatchException, ColorsDoNotMatchException {
        if(!first.getSize().equals(second.getSize())){
            throw new SizesDoNotMatchException();
        }
        if(!first.getColor().equals(second.getColor())){
            throw new ColorsDoNotMatchException();
        }
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
