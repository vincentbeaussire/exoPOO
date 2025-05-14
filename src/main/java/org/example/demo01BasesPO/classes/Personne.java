package org.example.demo01BasesPO.classes;

public class Personne {

    private int code;
    private String nom;

    private String prenom = "Christophe";
    public int age;

    public Personne(String nom, String prenom, int age) {
        this.code = 999;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "code=" + code +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom.toLowerCase().startsWith("c")) {
            System.out.println("Les prénoms commençant par c ne sont pas acceptés.");
        }
        this.nom = nom;
    }
}
