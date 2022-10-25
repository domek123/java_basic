package ARRAYS2;

import java.util.Arrays;

public class zad05 {
    public static void main(String[] args) {
        int [][]  t5 = new int[10][10];
        int suma1 = 0,suma2 = 0;
        for(int i = 0; i<10;i++){
            for(int j = 0; j<10;j++ ){
                if(j==0){
                    t5[i][j] = i;
                    suma1 += t5[i][j];
                }
                if(j==1){
                    t5[i][j] = i*i;
                    suma2 += t5[i][j];
                }
            }
        }
        System.out.println(suma1);
        System.out.println(suma2);
        System.out.println(Arrays.deepToString(t5));
    }
}
