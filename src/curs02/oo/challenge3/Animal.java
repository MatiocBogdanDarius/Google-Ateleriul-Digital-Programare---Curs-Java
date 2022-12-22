package curs02.oo.challenge3;

public abstract class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public void walk(){
        System.out.println("Animal walk");
    }

    public void eat(){
        System.out.println("Animal eat");
    }
}
