package org.example.Exercice_Joueur;

public class Main {
    public static void main(String[] args) {

        Joueur joueur1 = new Joueur("Warrior", 2, 15);
        Joueur joueur2 = new Joueur("Toto", 5, 25);

        joueur1.effectuerUneQuete();
        joueur1.niveau_joueur();
        System.out.println(joueur1);

        joueur2.effectuerUneQuete();
        joueur2.niveau_joueur();
        System.out.println(joueur2);
    }
}
