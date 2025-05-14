package org.example.Exercice_Chaise;

public class Chaise {
    private int nombre_pieds;
    private String materiaux;
    private String couleur;

    public Chaise(int nombre_pieds, String materiaux, String couleur) {
        this.nombre_pieds = nombre_pieds;
        this.materiaux = materiaux;
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Je suis une chaise avec " + this.nombre_pieds + " pied(s) en " + this.materiaux + " de couleur " + this.couleur + ".";
    }
}
