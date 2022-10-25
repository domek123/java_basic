package ARRAYS;

import java.util.*;

public class zad10 {
    public static void main(String[] args) {
        int[] A = { 2, 4, 2,0, 6, 7, 4, 3, 12, 6};
        int index = 0;
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A.length;j++){
                if(A[i] == A[j] && i != j){
                    index++;
                }
            }
        }
        int x = 0;
        int[] B = new int[A.length-index/2];

        for(int i = 0;i<A.length;i++){
            boolean isIn = false;

            for(int j = 0;j<A.length-index/2;j++){
                if(B[j] == A[i] && A[i] != 0){
                    isIn = true;
                }
            }
            if(!isIn){
                B[x] = A[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(B));
    }
}
