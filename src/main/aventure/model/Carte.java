package main.aventure.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Carte {
    private List<String> cartes;

    public Carte(String filePath)throws IOException{
        this.cartes= Files.readAllLines(Paths.get(filePath));
    }
    public boolean isFree(Coordonnee coordinates){
        int x=coordinates.getX();
        int y=coordinates.getY();
        return  x>=0 && x<cartes.get(0).length() && y>=0 && y<cartes.size() && cartes.get(y).charAt(x) == ' ';
    }
}
