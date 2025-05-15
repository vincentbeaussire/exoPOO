package org.example.Exercice_Plante;

public class Arbre extends Plante{
    public Arbre(String nom, int hauteur, String couleur_feuilles, int c_tronc) {
        super(nom, hauteur, couleur_feuilles, c_tronc);
        this.c_tronc = c_tronc;
    }
}
