package org.example.Exercice_Film;

public class Film {
    private String titre;
    private String realisateur;
    private int annee;
    private String genre;

    public Film(String titre, String realisateur, int annee, String genre) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.annee = annee;
        this.genre = genre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", annee=" + annee +
                ", genre='" + genre + '\'' +
                '}';
    }
}
