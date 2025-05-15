package org.example.Exercice_WaterTank;

public class Main {
    public static void main(String[] args) {
        WaterTank waterTank1 = new WaterTank(200, 500);
        WaterTank waterTank2 = new WaterTank(250, 650);



        System.out.println("Volume total des Watertank au départ : " + WaterTank.getTotalFillLevel());
        System.out.println("Je rajoute 50 litres au watertank 1");
        waterTank1.remplir(50);
        System.out.println("Je rajoute 100 litres au watertank 2");
        waterTank2.remplir(100);
        System.out.println(waterTank1);
        System.out.println(waterTank2);

        System.out.println("Volume total des Watertank au départ : " + WaterTank.getTotalFillLevel());

        System.out.println("Je vide de 50 litres le watertank 1");
        waterTank1.vider(50);
        System.out.println(waterTank1);
        System.out.println(waterTank2);

        System.out.println("Volume total des Watertank au départ : " + WaterTank.getTotalFillLevel());
    }
}
