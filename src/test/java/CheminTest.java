package test.java;

import main.java.aventure.model.Chemin;
import org.junit.Test;

import java.io.IOException;
import static org.junit.Assert.*;

public class CheminTest {
    @Test
    public void testConstructor() throws IOException {
        Chemin chemin = new Chemin("src/test/resources/mouvements.txt");
        assertNotNull(chemin.getInitialPosition());
    }

    @Test
    public void testIterator() throws IOException {
        Chemin chemin = new Chemin("src/test/resources/mouvements.txt");
        int stepCount = 0;
        for (char step : chemin) {
            stepCount++;
        }
        assertTrue(stepCount > 0);
    }
}
