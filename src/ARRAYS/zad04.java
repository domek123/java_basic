package ARRAYS;

public class zad04 {
    public static void main(String[] args) {
        int[][] tablica4 = new int[][] {{ 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }};
        int suma = 0;
        int suma2 = 0;
        for(int[] tab : tablica4){
            for(int x: tab){
                suma += x;
                if(x>3){
                    suma2+=x;
                }
            }
        }
        System.out.println(suma);
        System.out.println(suma2);
    }

}
