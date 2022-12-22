package curs02.oo.challenge3;

public class Spider extends Animal{
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider eat");
    }
}
