package ARRAYS;

import java.util.Arrays;

public class zad02 {
    public static void main(String[] args) {
        double[] tablica2 = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        double suma = 0;
        double suma2 = 0;
        double suma3 = 0;
        for(double x : tablica2){
            suma += x;
            if(x > 4.4){
                suma2 += x;
            }
        }
        for(int i = 0;i<tablica2.length;i++){
            if(i%2==0){
                suma3 += tablica2[i];
            }
        }
        System.out.println(suma);
        System.out.println(suma2);
        System.out.println(suma3);
    }
}
