package ARRAYS2;

import java.util.Arrays;

public class zad06 {
    public static void main(String[] args) {
        int [][]  ta = new int[10][10];
        int [][]  tb = new int[10][10];
        for(int i = 0; i<10;i++){
            for(int j = 0; j<10;j++ ){
                ta[i][j] = j;
            }
        }
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                tb[i][j] = ta[j][i];
            }
        }
        System.out.println(Arrays.deepToString(ta));
        System.out.println(Arrays.deepToString(tb));

    }
}
