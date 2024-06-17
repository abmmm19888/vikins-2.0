package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    private String saxonMsg;

    public Saxon(int health, int strength) {
        super(health, strength);
        this.saxonMsg = "";
    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
        if (isAlive()) {
            this.saxonMsg = "A Saxon has received " + damage + " points of damage";
        } else {
            this.saxonMsg = "A Saxon has died in combat";
        }
    }

    public String getSaxonMsg() {
        return saxonMsg;
    }
}
