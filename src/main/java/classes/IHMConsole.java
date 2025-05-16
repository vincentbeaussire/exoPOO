//package classes;
//
//import java.util.Scanner;
//
//public class IHMConsole {
//
//    private Scanner scanner;
//    private Entreprise entreprise;
//
//
//    public IHMConsole() {
//        this.scanner = new Scanner(System.in);
//        this.entreprise = new Entreprise;
//    }
//
//    public void afficheMenu() {
//        System.out.println("""
//                ### Menu Annuaire Entreprise ###
//                1) Ajouter une entreprise
//                2) Voir toutes les entreprises (juste le nom)
//                3) Voir le détail d'une entreprise
//                0) Quitter
//                Votre choix :
//                """);
//    }
//
//    public void startMenu() {
//        int choix = 99;
//        while (choix != 0) {
//            afficheMenu();
//            choix = this.scanner.nextInt();
//
//            switch (choix) {
//                case 1:
//                    System.out.println("L'utilisateur a fait le choix 1");
//                    break;
//                case 2:
//                    System.out.println("L'utilisateur a fait le choix 2");
//                    break;
//                case 3:
//                    System.out.println("L'utilisateur a fait le choix 3");
//                    break;
//                case 0:
//                    System.out.println("Au revoir");
//                    break;
//                default:
//                    System.out.println("Choix invalide");
//                    break;
//            }
//        }
//    }
//}
