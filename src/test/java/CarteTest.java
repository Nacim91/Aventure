package test.java;

import main.java.aventure.model.Carte;
import main.java.aventure.model.Chemin;
import main.java.aventure.model.Coordonnee;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class CarteTest {
    @Test
    public void testIsFree() throws IOException {
        Carte carte = new Carte("src/test/resources/carte.txt");
        Coordonnee coord = new Coordonnee(3, 0);
        assertTrue(carte.isFree(coord));

        coord = new Coordonnee(1, 1);
        assertFalse(carte.isFree(coord));
    }

    @Test
    public void testConstructor() throws IOException {
        Carte carte = new Carte("src/test/resources/carte.txt");
        assertNotNull(carte);
    }
}
