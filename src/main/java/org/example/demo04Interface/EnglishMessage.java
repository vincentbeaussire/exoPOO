package org.example.demo04Interface;

public class EnglishMessage implements IMessage {
    @Override
    public void okMessage() {
        System.out.println("All is ok");
    }

    @Override
    public void warningMessage() {
        System.out.println("We have a problem");
    }

    @Override
    public void errorMessage() {
        System.out.println("We have an error");
    }
}
