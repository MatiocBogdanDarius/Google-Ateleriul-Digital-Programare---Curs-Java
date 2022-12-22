package curs02.oo.challenge1;

import java.util.Random;
import java.util.random.RandomGenerator;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public void fight(){
        Random randomGenerator = new Random();
        while (fighter1.isAlive() && fighter2.isAlive()){
            if (randomGenerator.nextBoolean()) {
                fighter1.attack(fighter2);
            } else {
                fighter2.attack(fighter1);
            }
        }
        String winner = fighter1.isAlive() ? fighter1.getName() : fighter2.getName();
        System.out.println("Winner: " + winner);
    }
}
