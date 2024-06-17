package org.example.vikins;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VikingTest {
    private Viking viking;

    @BeforeEach
    public void setUp() {
        viking = new Viking("Ragnar", 100, 30); // Ejemplo de valores, ajustar según tu implementación
    }

    @Test
    public void testReceiveDamageAlive() {
        viking.receiveDamage(30);
        assertEquals("Ragnar has received 30 points of damage", viking.getVikingMsg());
        assertTrue(viking.isAlive());
    }

    @Test
    public void testReceiveDamageDead() {
        viking.receiveDamage(100); // Suponiendo que la salud inicial es 100
        assertEquals("Ragnar has died in act of combat", viking.getVikingMsg());
    }
}
