package curs05.generics.challenge2;

public class Running implements Shoe{
    private String color;
    private Integer size;

    public Running(String color, Integer size) {
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
        return "Running{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
