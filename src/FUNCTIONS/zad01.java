package FUNCTIONS;

import java.util.*;

public class zad01 {
    public static void main(String[] args) {
        System.out.println("SORTOWANIE");
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Julia");
        lista.add("Agata");
        lista.add("Zenek");
        lista.add("Jarek");
        lista.add("Kasia");
        lista.add("Dominika");
        System.out.println("Elementy nieposortowane.");
        printujListe(lista);
        Collections.sort(lista);
        System.out.println("Elementy posortowane.");
        printujListe(lista);
    }

    public static void printujListe(ArrayList<String> list){
        for(String item : list){
            System.out.println(item);
        }
    }

}
