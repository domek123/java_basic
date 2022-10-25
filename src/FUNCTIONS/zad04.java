package FUNCTIONS;

import java.util.*;

public class zad04 {
    static HashMap <Character, Integer> map = new HashMap<>(){
        {
            put('a', 1);
            put('e', 1);
            put('i', 1);
            put('o', 1);
            put('u', 1);
            put('l', 1);
            put('n', 1);
            put('r', 1);
            put('s', 1);
            put('t', 1);
            put('d', 2);
            put('g', 2);
            put('b', 3);
            put('c', 3);
            put('m', 3);
            put('p', 3);
            put('f', 4);
            put('h', 4);
            put('v', 4);
            put('w', 4);
            put('y', 4);
            put('k', 5);
            put('j', 8);
            put('x', 8);
            put('q', 10);
            put('z', 10);
        }
    };
    public static void main(String[] args) {
        System.out.println(scoreWord("javascript"));
    }
    private static Integer score(Character key){
        return map.get(key);
    }
    private static Integer scoreWord(String word){
        int suma = 0;
        for(Character ch : word.toCharArray()){
            suma += score(ch);
        }
        return suma;
    }
}
