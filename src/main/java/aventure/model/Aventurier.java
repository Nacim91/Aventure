package main.java.aventure.model;

public class Aventurier {
    private Coordonnee position;

    public Aventurier(Coordonnee position) {
        this.position = position;
    }

    public void moveTo(Coordonnee newPosition) { position = newPosition; }
    public Coordonnee getPosition() { return position; }
}
