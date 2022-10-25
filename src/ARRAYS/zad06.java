package ARRAYS;

public class zad06 {
    public static void main(String[] args) {
        String[][] tablica6 = new String[][] {{ "100", "222" },{ "3333", "44" },{ "555", "6" },{ "7", "888" }};
        int suma = 0;
        for(String[] tab: tablica6){
            for(String x : tab){
                suma += Integer.parseInt(x);
            }
        }
        System.out.println(suma);
    }
}
