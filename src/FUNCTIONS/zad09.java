package FUNCTIONS;

import java.util.*;

public class zad09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj litere:");
        String letter = scan.nextLine();
        System.out.println("podaj wyrazy (/koniec by zakonczyc)");
        ArrayList<String> wordList = new ArrayList<>();

        while(true){
            String word = scan.nextLine();
            if(word.equals("/koniec")){
                break;
            }else{
                wordList.add(word);
            }
        }
        Set<Integer> numbers = new HashSet<>();

        for(String word : wordList){
            int index = 0;
            for(Character c : word.toCharArray()){
                if(c == letter.charAt(0)){
                    index++;
                }
            }
            numbers.add(index);
        }

        for(Integer number : numbers){
            System.out.println("== Ilość wystąpień: " + number + " ==");
            for(String word : wordList){
                int index = 0;
                for(Character c : word.toCharArray()){
                    if(c == letter.charAt(0)){
                        index++;
                    }
                }
                if(index == number){
                    System.out.println(word);
                }
            }
        }
    }

}
