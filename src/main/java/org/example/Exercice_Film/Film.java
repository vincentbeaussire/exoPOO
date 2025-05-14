package org.example.Exercice_Film;

import java.time.LocalDate;

public class Film {
    private String titre;
    private String realisateur;
    private LocalDate annee;
    private String genre;

    public Film(String titre, String realisateur, LocalDate annee, String genre) {
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

    public LocalDate getAnnee() {
        return annee;
    }

    public void setAnnee(LocalDate annee) {
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
                "titre='" + this.titre + '\'' +
                ", realisateur='" + this.realisateur + '\'' +
                ", annee=" + this.annee +
                ", genre='" + this.genre + '\'' +
                '}';
    }
}
