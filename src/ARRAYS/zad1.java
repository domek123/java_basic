package ARRAYS;

public class zad1 {
    public static void main(String[] args) {
        int[] tablica1 = {2,5,43,11,23,78,333,765,67,67,67,111,123};
        int suma = 0;
        for(int x : tablica1){
            suma += x;
        }
        System.out.println(suma);
    }
}
