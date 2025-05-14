package org.example.demo03Static;

public class Main {
    public static void main(String[] args) {
        System.out.println(Chien.getNombreChiens());
        System.out.println(Chien.getEspece());

        Chien chien1 = new Chien("Rex", 5, "Labrador");
        Chien chien2 = new Chien("Poupette", 2, "Pitbull");
        System.out.println(Chien.getNombreChiens());

        Chien.lesChiensPeuventVoler();
    }
}
