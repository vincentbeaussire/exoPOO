package org.example.Exercice_WaterTank;

public class WaterTank {
    private  int poids_vide;
    private int capacite_max;
    private int niveau_remplissage;
    public static int volume_total;

    public WaterTank(int poids_vide, int capacite_max, int niveau_remplissage) {
        this.poids_vide = poids_vide;
        this.capacite_max = capacite_max;
        this.niveau_remplissage = niveau_remplissage;
    }

    public int getPoids_vide() {
        return poids_vide;
    }

    public void setPoids_vide(int poids_vide) {
        this.poids_vide = poids_vide;
    }

    public int getCapacite_max() {
        return capacite_max;
    }

    public void setCapacite_max(int capacite_max) {
        this.capacite_max = capacite_max;
    }

    public int getNiveau_remplissage() {
        return niveau_remplissage;
    }

    public void setNiveau_remplissage(int niveau_remplissage) {
        this.niveau_remplissage = niveau_remplissage;
    }

    public void remplir() {
        volume_total += poids_vide;
        if (volume_total > capacite_max) {
            System.out.println("Erreur");
        }
    }

    public void vider() {
        volume_total -= poids_vide;
        if (volume_total < 0) {
            System.out.println("Erreur");
        }
    }

    @Override
    public String toString() {
        return "Le poids à vide est de : " + poids_vide + ", sa capacité maximale est de : " + capacite_max + ", et son niveau de remplissage actuel est de : " + volume_total + " m3.";
    }
}
