package curs02.oo.challenge2;


public class Actor {
    private String name;
    private Integer age;
    private Award[] awards;

    public Actor(String name, Integer age, Award[] awards) {
        this.name = name;
        this.age = age;
        this.awards = awards;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
