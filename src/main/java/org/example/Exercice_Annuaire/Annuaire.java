//package org.example.Exercice_Annuaire;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Annuaire  {
//
////    private List<Entreprise> entreprises = new ArrayList<>();
//    // Deuxième façon
//    private  List<Entreprise> entreprise;
//
////    public Annuaire() {
////        entreprises = new ArrayList<>();
////    }
//
//    public void addEntrepriseToAnnuaire(String nom, int numeroSiret, String addresse, String sitWeb) {
//        if (sitWeb.startsWith("www")) {
//            Entreprise entreprise = new Entreprise(nom, numeroSiret, addresse, sitWeb);
//            this.entreprise.add(entreprise);
//        }
//    }
//
//    public List<String> showAllNamedEntreprise() {
//        List<String> nom = new ArrayList<>();
//        for (int i = 0; i < this.entreprise.size(); i++ ) {
//            System.out.println(i+this.entreprise.get(i).getNom());
//        }
//    }
//
//    public void showDetailsEntreprise() {
//        if (indice < this.entreprise.size()) {
//            System.out.println(this.entreprise.get(indice));
//        }
//    }
//}
