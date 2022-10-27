package FUNCTIONS;

import java.util.ArrayList;
import java.util.Scanner;

public class zad03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wyraz");
        String text = scanner.nextLine();
        text = Reverse(text);
        System.out.println(text);
        text = Reverse(text);
        System.out.println(text);
    }
    private static String Reverse(String text){
        ArrayList<Character> t = new ArrayList<>();
        String a = "";
        for(Character ch : text.toCharArray()){
            t.add(ch);
        }
        for(int i = t.size()-1;i>=0;i--){
            a+=t.get(i);
        }
        return a;
    }

}
