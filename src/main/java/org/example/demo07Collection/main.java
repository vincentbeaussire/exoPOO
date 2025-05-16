package org.example.demo07Collection;

import java.util.*;

public class main {
    public static void main(String[] args) {
        // Démo pour SortedSet (HashSet)
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("C++");
        set.add("Python3");
        System.out.println("Hashset : " + set);

        // Démo pour SortedSet (TreeSet)
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("Python");
        sortedSet.add("C++");
        sortedSet.add("C++");
        sortedSet.add("Python3");
        sortedSet.add("JavaScript");
        System.out.println("SortedSet : " + sortedSet);

        // Méthode pour SortedSet
        System.out.println("Premier élément : " + sortedSet.first());
        System.out.println("Premier élément : " + sortedSet.last());
        SortedSet<String> headset = sortedSet.headSet("Python");
        System.out.println("Sous-ensemble avant Python : " + headset);
        SortedSet<String> tailset = sortedSet.tailSet("Javascript");
        System.out.println("sous-ensemble après javascript " + tailset);

        // Démo pour le HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 20);
        hashMap.put("Python", 10);
        hashMap.put("C++", 30);
        System.out.println("Mon hashMap : "+ hashMap);

        if (hashMap.containsKey("Java")) {
            System.out.println("La clé Java existe déjà");
        }

        if (hashMap.containsKey("Toto")) {
            System.out.println("La clé Toto existe déjà");
        } else {
            hashMap.put("Toto", 50);
        }
        System.out.println("Mon hashMap : "+ hashMap);

        // Méthodes pour le hahsMap
        System.out.println("Nombre d'éléments dans mon hashmap : "+ hashMap.size());
        System.out.println("Valeur associé à la clé Java : "+ hashMap.get("Java"));
        System.out.println("Supprimer l'élément avec la clé Toto");
        hashMap.remove("Toto");
        System.out.println("Après suppression : "+ hashMap);

        // Parcourir notre hashmap en utilisant les clés
        for (String key : hashMap.keySet()) {
            System.out.println("La clé est : "+ key);
            System.out.println("Et sa valeur est: "+ hashMap.get(key));
        }

        // en utilisant les valeurs
        for (int values : hashMap.values()) {
            System.out.println("Ma valeur : " + values);
        }

        // Parcourir avec une boucle for each
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Ma clé : "+ entry.getKey() + " et ma valeur "+ entry.getValue());
        }
   }
}

