package org.example.demo04Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //    ClasseDemo classeDemo = new ClasseDemo();
//    ClasseDemo2 classeDemo2 = new ClasseDemo2();
//
//    DemoBaseInterface[] demoBaseInterfaces = { classeDemo, classeDemo2 };

        IMessage message;
        Scanner scanner = new Scanner(System.in);
        System.out.println("taper 1 pour FR, tape 2 pour EN");
        int choix = scanner.nextInt();
        if (choix == 1) {
            message = new MessageV1();
        } else {
            message = new EnglishMessage();
        }

        message.okMessage();
        message.warningMessage();
        message.errorMessage();
    }
}

