package test.java;

import main.java.aventure.model.Coordonnee;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoordonneeTest {
    @Test
    public void testMoveNorth() {
        Coordonnee coord = new Coordonnee(5, 5);
        coord.move('N');
        assertEquals(5, coord.getX());
        assertEquals(4, coord.getY());
    }

    @Test
    public void testMoveSouth() {
        Coordonnee coord = new Coordonnee(5, 5);
        coord.move('S');
        assertEquals(5, coord.getX());
        assertEquals(6, coord.getY());
    }

    @Test
    public void testMoveEast() {
        Coordonnee coord = new Coordonnee(5, 5);
        coord.move('E');
        assertEquals(6, coord.getX());
        assertEquals(5, coord.getY());
    }

    @Test
    public void testMoveWest() {
        Coordonnee coord = new Coordonnee(5, 5);
        coord.move('O');
        assertEquals(4, coord.getX());
        assertEquals(5, coord.getY());
    }

    @Test
    public void testConstructor() {
        Coordonnee coord = new Coordonnee(3, 7);
        assertEquals(3, coord.getX());
        assertEquals(7, coord.getY());
    }
}
