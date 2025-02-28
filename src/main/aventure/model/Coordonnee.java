package main.aventure.model;

public class Coordonnee {
    private int x;
    private int y;

    public Coordonnee(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(char direction){
        switch (direction){
            case 'N' : y--;break;
            case 'S' : y++;break;
            case 'E' : x++;break;
            case 'O' : x--;break;
        }
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
