package FUNCTIONS;

import java.util.ArrayList;
import java.util.Arrays;

public class zad08 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
            Arrays.asList(0, 2, 4, 2, 6, 7, 4, 3, 12, 6));
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int x : list){
            if(!list2.contains(x)){
                list2.add(x);
            }
        }
        System.out.println(list2);
    }

}
