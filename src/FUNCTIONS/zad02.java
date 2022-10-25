package FUNCTIONS;

import java.util.ArrayList;
import java.util.Scanner;

public class zad02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj n:");
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        Sumowanie(n,list);
    }
    public static void Sumowanie(int n, ArrayList<Integer> list){
        for(int i = 0; i<=n;i++){
            list.add(i);
        }
        System.out.println(list);
        int suma = 0;
        for(int x : list){
            suma+=x;
        }
        System.out.println(suma);
    }
}
