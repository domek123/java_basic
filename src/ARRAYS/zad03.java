package ARRAYS;

public class zad03 {
    public static void main(String[] args) {
        String[] tablica3 = {"koty","psy","owoce","grzyby","samochody","kanarki"};
        int count = 0;
        for(String elem : tablica3){
            if(elem.startsWith("k")){
                System.out.println(elem);
                count++;
            }
        }
        System.out.println(count);
        int count2 = 0;
        for(String elem : tablica3){
            if(elem.length()>4){
                System.out.println(elem);
                count2++;
            }
            if(elem.length()>5){
                System.out.println("wieksze niz 5:" + elem);
            }
        }
        System.out.println(count2);
    }
}
