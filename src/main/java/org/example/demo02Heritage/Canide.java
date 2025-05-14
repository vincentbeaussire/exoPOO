package org.example.demo02Heritage;

public class Canide {

    protected int age; // Accessible librement dans les classes enfants
    protected String nom;

    public Canide(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    public void crier() {
        System.out.println("cri du canidé");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Canidé de nom : " + this.nom + " et d'âge : " + this.age;
    }
}
