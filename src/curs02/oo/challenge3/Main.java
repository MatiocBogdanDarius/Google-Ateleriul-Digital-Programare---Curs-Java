package curs02.oo.challenge3;

public class Main {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        c.eat();
        a.eat();
        e.eat();
        // p.eat(); -> Compile error

        d.walk();
        c.walk();
        ((Animal) c).walk();
        a.walk();
        e.walk();
//        p.walk(); -> Compile error

        System.out.println(d.getName());
        System.out.println(c.getName());
        System.out.println(c.getName());
//        a.getName(); -> Compile error
//        e.getName(); -> Compile error
        System.out.println(p.getName());
    }
}
