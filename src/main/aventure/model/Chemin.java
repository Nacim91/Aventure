package main.aventure.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class Chemin implements Iterable<Character>{

    private String mouvements;
    private Coordonnee initialPosition;

    public Chemin(String filePath) throws IOException {
        List<String> data = Files.readAllLines(Paths.get(filePath));

        if (data.size() < 2) {
            throw new IllegalArgumentException("Le fichier des déplacements est invalide.");
        }

        String[] coordinates = data.get(0).split(",");
        this.initialPosition = new Coordonnee(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
        this.mouvements = data.get(1);
    }

    public Coordonnee getInitialPosition() {
        return initialPosition;
    }

    @Override
    public Iterator<Character> iterator() {
        return new Iterator<Character>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<mouvements.length();
            }

            @Override
            public Character next() {
                return mouvements.charAt(index++);
            }
        };
    }
}
