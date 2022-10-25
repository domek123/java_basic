package FUNCTIONS;

import java.util.ArrayList;
import java.util.Scanner;

public class zad07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0;i<n;i++){
                for(int j = 0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                for(int x:CountRow(i)){
                    System.out.print(x +" ");
                }
            System.out.println("");

        }

    }
    private static ArrayList<Integer> CountRow(int r){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<r;i++){
            int sn = countSilnia(r)/(countSilnia(i)*countSilnia(r-i));
            list.add(sn);
        }
        list.add(1);
        return list;
    }
    private static int countSilnia(int n){
        int licznik = 1;
        for(int i = 1;i<=n;i++){
            licznik *= i;
        }
        return licznik;
    }
}
