package test.java;

import main.java.aventure.model.Aventurier;
import main.java.aventure.model.Coordonnee;
import org.junit.Test;
import static org.junit.Assert.*;

public class AventurierTest {
    @Test
    public void testMoveTo() {
        Coordonnee initialPos = new Coordonnee(1, 1);
        Aventurier aventurier = new Aventurier(initialPos);
        Coordonnee newPos = new Coordonnee(2, 2);
        aventurier.moveTo(newPos);
        assertEquals(2, aventurier.getPosition().getX());
        assertEquals(2, aventurier.getPosition().getY());
    }

    @Test
    public void testGetPosition() {
        Coordonnee initialPos = new Coordonnee(0, 0);
        Aventurier aventurier = new Aventurier(initialPos);
        assertEquals(0, aventurier.getPosition().getX());
        assertEquals(0, aventurier.getPosition().getY());
    }
}
