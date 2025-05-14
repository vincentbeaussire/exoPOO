package org.example.Exercice_Joueur;

public class Joueur {
    private String nom;
    private int niveau = 1;
    private int pts_xp = 0;

    public Joueur(String nom, int niveau, int pts_xp) {
        this.nom = nom;
//        this.niveau = 1;
//        this.pts_xp = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPts_xp() {
        return pts_xp;
    }

    public void setPts_xp(int pts_xp) {
        this.pts_xp = pts_xp;
    }

    public void effectuerUneQuete() {
        pts_xp += 10;
    }

    private void niveau_joueur() {
        if (pts_xp >= 100) {
            niveau++;
            pts_xp = 0;
            System.out.println("Le joueur " + this.nom + " passe au niveau " + this.niveau);
        }
    }

    @Override
    public String toString() {
        return "Le joueur " + this.nom + " effectue la quête numéro " + this.niveau + " et il a " + this.pts_xp + " points d'xp";
    }
}
