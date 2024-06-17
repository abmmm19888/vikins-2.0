package org.example.saxon;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SaxonTest {
    private Saxon saxon;

    @BeforeEach
    public void setUp() {
        saxon = new Saxon(80, 25);
    }

    @Test
    public void testReceiveDamageAlive() {
        saxon.receiveDamage(30);
        assertEquals("A Saxon has received 30 points of damage", saxon.getSaxonMsg());
        assertTrue(saxon.isAlive());
    }

    @Test
    public void testReceiveDamageDead() {
        saxon.receiveDamage(80);
        assertEquals("A Saxon has died in combat", saxon.getSaxonMsg());
    }
}
