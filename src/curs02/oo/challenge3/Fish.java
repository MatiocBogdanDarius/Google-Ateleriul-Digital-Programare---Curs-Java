package curs02.oo.challenge3;

public class Fish extends Animal implements Pet{
    private String name;

    public Fish(){
        super(0);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish play");
    }

    @Override
    public void walk() {
        System.out.println("Fish don't walk");
    }

    @Override
    public void eat() {
        System.out.println("Fish eat");
    }
}
