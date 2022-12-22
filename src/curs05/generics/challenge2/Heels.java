package curs05.generics.challenge2;

public class Heels implements Shoe{
    private String color;
    private Integer size;

    public Heels(String color, Integer size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Heels{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
