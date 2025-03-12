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
        Carte carte = new Carte("src/main/resources/carte.txt");
        Coordonnee coordonneeLibre = new Coordonnee(3, 0);
        Coordonnee coordonneeOccupée = new Coordonnee(0, 0);

        assertTrue(carte.isFree(coordonneeLibre));
        assertFalse(carte.isFree(coordonneeOccupée));
    }

    @Test
    public void testMove() {
        Coordonnee coord = new Coordonnee(2, 2);

        coord.move('N');
        assertEquals(1, coord.getY());  // Vérifie que y a bien décrémenté

        coord.move('S');
        assertEquals(2, coord.getY());  // Vérifie que y a bien incrémenté

        coord.move('E');
        assertEquals(3, coord.getX());  // Vérifie que x a bien incrémenté

        coord.move('O');
        assertEquals(2, coord.getX());  // Vérifie que x a bien décrémenté
    }

    @Test
    public void testChemin() throws IOException {
        Chemin chemin = new Chemin("src/test/resources/mouvements.txt");
        assertNotNull(chemin.getInitialPosition());

        char[] mouvements = new char[] {'N', 'E', 'S'};
        int i = 0;
        for (char move : chemin) {
            assertEquals(mouvements[i++], move);
        }
    }
}
