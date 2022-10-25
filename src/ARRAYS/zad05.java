package ARRAYS;

public class zad05 {
    public static void main(String[] args) {
        int[][] tablica5 = new int[][] {{ 1, 2 }, { 3, 3 }, { 1, 4 }, { 7, 3 }, { 1, 6 }, { 3, 5 },{ 1, 8 },{ 7, 9 }};
        int suma = 0;
        for(int[] tab : tablica5){
            if(tab[0] == 1){
                for(int x : tab){
                    suma += x;
                }
            }
        }
        System.out.println(suma);
    }
}
