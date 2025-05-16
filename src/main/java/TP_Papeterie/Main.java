package TP_Papeterie;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map<String, Integer> artRef = new HashMap<>();
        artRef.put("Stylo1", 123456789);
        artRef.put("Stylo2", 987654321);
        artRef.put("Stylo3", 134679852);
        System.out.println("Nom et référence de l'article "+artRef);
    }
}
