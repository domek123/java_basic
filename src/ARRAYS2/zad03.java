package ARRAYS2;

import java.util.Arrays;

public class zad03 {
    public static void main(String[] args) {
        int [][]  t3 = new int[10][10];
        int suma = 0;
        for(int i = 0;i<10;i++){
            for(int j = 9;j>=0;j--){
                if(i+j == 9){
                    t3[i][j] = 1;
                    suma += 1;
                }else{
                    t3[i][j] = 0;
                }
            }
        }
        System.out.println(suma);
        System.out.println(Arrays.deepToString(t3));
    }
}
