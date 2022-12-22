package curs02.oo.challenge2;

import java.util.Arrays;
import java.util.List;

public class Movie {
    private Integer yearOfAppearance;
    private String name;
    private Actor[] actors;

    public Movie(Integer yearOfAppearance, String name, Actor[] actors) {
        this.yearOfAppearance = yearOfAppearance;
        this.name = name;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public List<Actor> getActors() {
        return Arrays.stream(actors).toList();
    }

    public boolean haveActorOlderThan(int age) {
       return  Arrays.stream(actors).anyMatch(actor -> actor.getAge() > age);
    }
}
