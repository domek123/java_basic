package ARRAYS2;

import java.util.Arrays;

public class zad04 {
    public static void main(String[] args) {
        int [][]  t4 = new int[10][10];
        int suma = 0;
        for(int i = 0;i<10;i++){
            for(int j = 9;j>=0;j--){
                if(i+j == 9){
                    t4[j][i] = i;
                    suma += i;
                }else{
                    t4[j][i] = 0;
                }
            }
            System.out.println();
        }
        System.out.println(suma);
        System.out.println(Arrays.deepToString(t4));
}}
