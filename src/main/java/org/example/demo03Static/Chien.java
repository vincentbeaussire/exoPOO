package org.example.demo03Static;

public class Chien {
    private String nom;
    private int age;
    private String race;

    // Attributs de classes (static)
    private static String espece = "Canis Lupus Familiaris";
    private static int nombreChiens = 0;

    public Chien(String nom, int age, String race) {
        this.nom = nom;
        this.age = age;
        this.race = race;
        nombreChiens++; // Chien.nombreChiens++
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public static String getEspece() {
        return espece;
    }

    public static void setEspece(String espece) {
        Chien.espece = espece;
    }

    public static int getNombreChiens() {
        return nombreChiens;
    }

    public static void setNombreChiens(int nombreChiens) {
        Chien.nombreChiens = nombreChiens;
    }

    public static void lesChiensPeuventVoler() {
        System.out.println("Les chiens ne volent pas");
    }

    @Override
    public String toString() {
        return "Chien{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", race='" + race + '\'' +
                '}';
    }
}
