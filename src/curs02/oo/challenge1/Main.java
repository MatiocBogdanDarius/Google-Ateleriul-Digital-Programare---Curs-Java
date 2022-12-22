package curs02.oo.challenge1;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Vlad", 100, 15);
        Fighter fighter2 = new Fighter("Denis", 80, 20);
        BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);
        boxingMatch.fight();
    }
}
