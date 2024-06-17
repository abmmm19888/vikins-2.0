package org.example.war;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.example.saxon.Saxon;
import org.example.vikins.Viking;

public class War {
    private final List<Viking> vikingArmy;
    private final List<Saxon> saxonArmy;

    public War() {
        vikingArmy = new ArrayList<>();
        saxonArmy = new ArrayList<>();
    }

    public void addViking(Viking viking) {
        vikingArmy.add(viking);
    }

    public void addSaxon(Saxon saxon) {
        saxonArmy.add(saxon);
    }

    public String vikingAttack() {
        if (saxonArmy.isEmpty()) {
            return "No Saxons left to attack";
        }

        Viking viking = getRandomViking();
        Saxon saxon = getRandomSaxon();

        saxon.receiveDamage(viking.getStrength());

        if (!saxon.isAlive()) {
            saxonArmy.remove(saxon);
            return saxon.getSaxonMsg();
        }

        return saxon.getSaxonMsg();
    }

    public String saxonAttack() {
        if (vikingArmy.isEmpty()) {
            return "No Vikings left to attack";
        }

        Viking viking = getRandomViking();
        Saxon saxon = getRandomSaxon();

        viking.receiveDamage(saxon.getStrength());

        if (!viking.isAlive()) {
            vikingArmy.remove(viking);
            return viking.getVikingMsg();
        }

        return viking.getVikingMsg();
    }

    public String showStatus() {
        if (saxonArmy.isEmpty()) {
            return "Vikings have won the war of the century!";
        } else if (vikingArmy.isEmpty()) {
            return "Saxons have fought for their lives and survive another day...";
        } else {
            return "Vikings and Saxons are still in the thick of battle.";
        }
    }

    private Viking getRandomViking() {
        Random random = new Random();
        int index = random.nextInt(vikingArmy.size());
        return vikingArmy.get(index);
    }

    private Saxon getRandomSaxon() {
        Random random = new Random();
        int index = random.nextInt(saxonArmy.size());
        return saxonArmy.get(index);
    }
}
