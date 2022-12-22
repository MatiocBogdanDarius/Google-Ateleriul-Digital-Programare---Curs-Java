package curs03.design_pattern.challenge3;

public class Student {
    private String name;
    private Integer money;

    public Student(String name, Integer money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public Integer getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
