package org.example.soldier;

public class Soldier {
    private int health;
    private final int strength;
    protected String msg;

    public Soldier(int health, int strength) {
        this.health = health;
        this.strength = strength;
        this.msg = "";
    }

    public int attack() {
        return strength;
    }

    public void receiveDamage(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
