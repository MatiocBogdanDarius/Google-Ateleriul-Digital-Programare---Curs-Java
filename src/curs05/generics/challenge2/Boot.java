package curs05.generics.challenge2;

public class Boot implements Shoe{
    private String color;
    private Integer size;

    public Boot(String color, Integer size) {
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
        return "Boot{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
