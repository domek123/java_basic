package FUNCTIONS;

import java.util.ArrayList;
import java.util.Scanner;

public class zad03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wyraz");
        String text = scanner.nextLine();
        Reverse(text);
    }
    private static void Reverse(String text){
        ArrayList<Character> t = new ArrayList<>();
        for(Character ch : text.toCharArray()){
            t.add(ch);
        }
        for(int i = t.size()-1;i>=0;i--){
            System.out.print(t.get(i));
        }
    }

}
