package org.example.demo01BasesPO.classes;

public class Compte {

    //Attributs
    private int code;
    protected float solde;

    //Constructeur
    public Compte(int code, float solde) {
        this.code = code;
        this.solde = solde;
    }

    //Méthodes
    public void verser(float montant) {
        solde += montant;
    }

    public void retirer(float montant) {
        solde -= montant;
    }

    @Override
    public String toString() {
        return "Compte : code" + this.code + ", solde = " + this.solde + ".";
    }
}
