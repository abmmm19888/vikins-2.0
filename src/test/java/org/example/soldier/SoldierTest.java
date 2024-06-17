package org.example.soldier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SoldierTest {
    private Soldier soldier;

    @BeforeEach
    public void setUp() {
        soldier = new Soldier(100, 20);
    }

    @Test
    public void testAttack() {
        assertEquals(20, soldier.attack());
    }

    @Test
    public void testReceiveDamage() {
        soldier.receiveDamage(30);
        assertEquals(70, soldier.getHealth());
    }

    @Test
    public void testIsAlive() {
        assertTrue(soldier.isAlive());

        soldier.receiveDamage(100);
        assertFalse(soldier.isAlive());
    }
}
