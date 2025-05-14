package org.example.demo02Heritage;

public class Chien extends Canide {

    private String race;

    public Chien(int age, String nom, String race) {
        super(age, nom);
        this.race = race;
    }

    @Override
    public void crier() {
        super.crier();
        System.out.println("Le chien aboie");
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return super.toString() + " est un chien de race " + this.race;
    }
}
