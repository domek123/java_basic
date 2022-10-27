package FUNCTIONS;

import java.util.ArrayList;

public class zad06 {
    public static void main(String[] args) {
        System.out.println(check("bob"));
    }
    private static String check(String text){
        //95 - 122
        ArrayList<Character> list = new ArrayList<>();
        for(Character ch : text.toCharArray()){
            list.add(ch);
        }
        char base = 'a';
        String t = "";
        for(int i = 97;i<=122;i++){
            if(!list.contains(base)){
                t+=base;
            }
            base++;
        }
        return t;
    }
}
