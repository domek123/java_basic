package ARRAYS2;

import java.sql.Array;

public class zad01 {
    public static void main(String[] args) {
        int [][]  t1 = new int[10][10];
        int suma = 0;
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                if(i==j){
                    t1[i][j] = 1;
                    System.out.print(1 + " ");
                    suma += 1;
                }else{
                    System.out.print(0 + " ");
                    t1[i][j] = 0;
                }
            }
            System.out.println();
        }
        System.out.println(suma);
    }
}
