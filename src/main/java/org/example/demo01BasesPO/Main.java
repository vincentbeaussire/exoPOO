package org.example.demo01BasesPO;

import org.example.demo01BasesPO.classes.Personne;

public class Main {
    public static void main(String[] args) {
//
//        Compte c1 = new Compte(55, 56.2f);
//        Compte c2 = new Compte(84, 45.6f);
//
//        c1.retirer(100f);
//        c2.verser(52f);
//
//        System.out.println(c1.toString());
//        System.out.println(c2.toString());
//
//        Personne personne = new Personne();
//        System.out.println(personne.getNom());
//        personne.setNom("toto");
//        System.out.println(personne.getNom());
//
//        Personne personne1 = new Personne();
//        personne1.setNom("Cnoa");
//        System.out.println(personne1.getNom());

        Personne personne2 = new Personne("toto", "tata", 45);
        System.out.println(personne2);
    }
}