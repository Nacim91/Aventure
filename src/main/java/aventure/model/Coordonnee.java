package main.java.aventure.model;

public class Coordonnee {
    private int x;
    private int y;

    public Coordonnee(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Les coordonnées doivent être positives.");
        }

        this.x = x;
        this.y = y;
    }

    public void move(char direction){
        switch (direction){
            case 'N' : y--;break;
            case 'S' : y++;break;
            case 'E' : x++;break;
            case 'O' : x--;break;
            default:
                throw new IllegalArgumentException("Direction invalide. Utilisez N, O, E ou S.");
        }
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
