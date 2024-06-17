package org.example.war;

import org.example.saxon.Saxon;
import org.example.vikins.Viking;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WarTest {
    private War war;
    private Viking viking;
    private Saxon saxon;

    @BeforeEach
    public void setUp() {
        war = new War();
        viking = new Viking("Ragnar", 100, 30);
        saxon = new Saxon(80, 25);
    }

    @Test
    public void testVikingAttack() {
        war.addViking(viking);
        war.addSaxon(saxon);

        String result = war.vikingAttack();

        assertEquals("A Saxon has received 30 points of damage", result);
    }

    @Test
    public void testSaxonAttack() {
        war.addViking(viking);
        war.addSaxon(saxon);

        String result = war.saxonAttack();

        assertEquals("Ragnar has received 25 points of damage", result);
    }

    @Test
    public void testShowStatusVikingsWin() {
        war.addViking(viking);

        assertEquals("Vikings have won the war of the century!", war.showStatus());
    }

    @Test
    public void testShowStatusSaxonsWin() {
        war.addSaxon(saxon);

        assertEquals("Saxons have fought for their lives and survive another day...", war.showStatus());
    }

    @Test
    public void testShowStatusBattleContinues() {
        war.addViking(viking);
        war.addSaxon(saxon);

        assertEquals("Vikings and Saxons are still in the thick of battle.", war.showStatus());
    }
}
