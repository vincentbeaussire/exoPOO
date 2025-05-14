package org.example.Exercice_Joueur;

public class Main {
    public static void main(String[] args) {

        Joueur joueur = new Joueur("Warrior", 2, 15);
        Joueur joueur1 = new Joueur("Toto", 5, 25);

        for (int i = 0; i < 31; i++) {
            System.out.println("Le joueur " + joueur.getNom() + " effectue la quête n* " + i);
            joueur.effectuerUneQuete();
        }

        System.out.println(joueur);

        // Changement de nom
        joueur.setNom("LeGigaBossDuJava");
        System.out.println(joueur);
    }
}
