package org.example.Exercice_Annuaire;

public class Entreprise {

    private String nom;
    private int numeroSiret;
    private String addresse;
    private String sitweb;

    public Entreprise(String nom, int numeroSiret, String addresse, String sitweb) {
        this.nom = nom;
        this.numeroSiret = numeroSiret;
        this.addresse = addresse;
        this.sitweb = sitweb;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumeroSiret() {
        return numeroSiret;
    }

    public void setNumeroSiret(int numeroSiret) {
        this.numeroSiret = numeroSiret;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getSitweb() {
        return sitweb;
    }

    public void setSitweb(String sitweb) {
        this.sitweb = sitweb;
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "nom='" + nom + '\'' +
                ", numeroSiret=" + numeroSiret +
                ", addresse='" + addresse + '\'' +
                ", sitweb='" + sitweb + '\'' +
                '}';
    }
}
