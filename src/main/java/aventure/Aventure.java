package main.java.aventure;


import main.java.aventure.model.*;

import java.io.IOException;

public class Aventure {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Merci de fournir en entrée le fichier de deplacement. exemple: java Aventure mouvements.txt");
            return;
        }

        Carte carte;
        Chemin mouvements;
        boolean axesInverser = false;

        try {
            carte = new Carte("src/main/resources/carte.txt");
            mouvements = new Chemin(args[0]);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Coordonnee position = mouvements.getInitialPosition();

        if (!carte.isFree(position)) {
            position = new Coordonnee(position.getY(), position.getX());
            axesInverser = true;
        }

        Aventurier aventurier = new Aventurier(position);

        for (char step : mouvements) {
            Coordonnee newPosition = new Coordonnee(aventurier.getPosition().getX(), aventurier.getPosition().getY());
            newPosition.move(step);

            if (carte.isFree(newPosition)) {
                aventurier.moveTo(newPosition);
            }
        }

        if (axesInverser) {
            System.out.println("Le personnage doit se trouver en (" + aventurier.getPosition().getY() + "," + aventurier.getPosition().getX() + ")");
        } else {
            System.out.println("Le personnage doit se trouver en (" + aventurier.getPosition().getX() + "," + aventurier.getPosition().getY() + ")");
        }
    }
}
