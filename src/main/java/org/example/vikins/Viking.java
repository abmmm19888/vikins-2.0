package org.example.vikins;

import org.example.soldier.Soldier;

public class Viking extends Soldier {
    private final String name; // Agregar final aquí si no quieres que el valor de 'name' cambie
    private String vikingMsg;

    public Viking(String name, int health, int strength) {
        super(health, strength);
        this.name = name;
    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
        if (isAlive()) {
            this.vikingMsg = name + " has received " + damage + " points of damage";
        } else {
            this.vikingMsg = name + " has died in act of combat";
        }
    }

    public String getVikingMsg() {
        return vikingMsg;
    }

    public String battleCry() {
        return "Odin Owns You All!";
    }
}
