package org.example.demo02Heritage;

public class Main {
    public static void main(String[] args) {
        Chien chien = new Chien(7, "Rex", "Labrador");
        Chien chien1 = new Chien(7, "Tutu", "Labrador");
        chien.crier();

        Hyenne hyenne = new Hyenne(12, "toto");
        Hyenne hyenne1 = new Hyenne(14, "tota");
        hyenne.crier();

        System.out.println(chien);
        System.out.println(hyenne);

        Chien[] chiens = { chien, chien1 };
        Hyenne[] hyennes = { hyenne, hyenne1 };
        Canide[] canides = { chien, hyenne, chien1, hyenne1 };

        for (Canide canide : canides) {
            System.out.println("----------------------");
            System.out.println(canide);
            System.out.println("----------------------");
            if (canide instanceof Chien) {
                Chien chien2 = (Chien) canide;
                System.out.println("Il s'agit d'un chien");
                canide.crier();
            }
            System.out.println("----------------------");
        }
        System.out.println(hyenne1.getClass().getSimpleName());
    }
}
