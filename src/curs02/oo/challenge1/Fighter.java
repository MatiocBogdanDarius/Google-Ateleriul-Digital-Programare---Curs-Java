package curs02.oo.challenge1;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void receiveAttack(int damage){
        health -= damage;
    }

    public void attack(Fighter opponent){
        opponent.receiveAttack(damagePerAttack);
    }
}
