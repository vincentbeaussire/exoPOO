package org.example.demo06List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Syntaxe pour la collection List
        // List<String> prenoms = new ArrayList<String>();
        List<String> prenoms = new ArrayList<String>();

        // List<Double> // toujours une liste d'objets --> pour les primitifs, on utlise les classes wrapper
        // la méthode add() pour ajouter un élement
        prenoms.add("toto");
        prenoms.add("tata");
        prenoms.add("tutu");
        prenoms.add("titi");

        // la méthode de get pour accèder à un élement par son indice
        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));
        System.out.println(prenoms.get(3));

        // la méthode set permet de modifier un élement à son index précis
        prenoms.set(2, "tyty");
        System.out.println(prenoms.get(2));

        // la méthode remove permet de supprimer un élement
        prenoms.remove(0);
        System.out.println(prenoms);

        // la méthode size qui permet de retourner la taille de la liste
        System.out.println(prenoms.size());

        // parcourir avec la boucle for each
        for (String p : prenoms) {
            System.out.println(p.toUpperCase());
        }

        // parcourir avec un for
        for (int i = 0; i < prenoms.size(); i++) {
            System.out.println(prenoms.get(i));
        }
    }
}
