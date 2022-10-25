package ARRAYS;

public class zad07 {
    public static void main(String[] args) {
        String[][] tablica7 = new String[][] {
    { "aaa", "bbb", "ccc" },
    { "ccc", "bbb", "aaa" },
    { "aaa", "bbb", "ccc" },
    { "ddd", "aaa", "aaa" },
    { "aaa", "bbb", "aaa" },
    { "ccc", "bbb", "eee" },
    { "eee", "bbb", "aaa" },
    { "ddd", "bbb", "fff" }
};
        int count = 0;
        for(String[] tab : tablica7){
            if(tab[0].contains("aaa") || tab[1].contains("aaa")){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
