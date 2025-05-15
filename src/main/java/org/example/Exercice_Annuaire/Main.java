package org.example.Exercice_Annuaire;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Ajouter des entreprises
        List<Entreprise> entreprises = new ArrayList<>();
        entreprises.add(new Entreprise("Sncf", 123, "Paris 08", "www.sncf.com"));
        entreprises.add(new Entreprise("Total Energies", 456, "Paris 07", "www.totalenergies.com"));
        entreprises.add(new Entreprise("Air France", 789, "Paris 16", "www.airfrance.com"));

        System.out.println(entreprises);


        // voir toutes les entreprises
        for (int i = 0; i < entreprises.size(); i++) {
            System.out.println(entreprises);
        }

        // Une façon plus propre pour voir les entreprises
        for (int j = 0; j < entreprises.size(); j++) {
            System.out.println(entreprises.get(j));
        }

        // Voir une seule entreprise
        System.out.println(entreprises.get(1));
    }
}