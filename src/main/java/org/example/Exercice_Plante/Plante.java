package org.example.Exercice_Plante;

public class Plante {
    private String nom;
    private int hauteur;
    private String couleur_feuilles;
    public int c_tronc;

    public Plante(String nom, int hauteur, String couleur_feuilles, int c_tronc) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleur_feuilles = couleur_feuilles;
        this.c_tronc = c_tronc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleur_feuilles() {
        return couleur_feuilles;
    }

    public void setCouleur_feuilles(String couleur_feuilles) {
        this.couleur_feuilles = couleur_feuilles;
    }

    @Override
    public String toString() {
        return "La plante : " + nom + " à une hauteur de " + hauteur + " et ses feuilles sont " + couleur_feuilles;
    }
}
