package ARRAYS;

public class zad08 {
    public static void main(String[] args) {
        boolean[][] tablica8 = new boolean[][]{
    { true, true, true, false, true, true, true, false },
    { true, true, true, true, true, true, true, true },
    { true, false, false, false, true, true, true, true },
    { false, false, true, true, false, true, false, true }
};
        int counter = 0;
        for(int i = 0;i<tablica8.length;i++){
            if(i == 2 || i == 3){
                for(boolean x : tablica8[i]){
                    if(x == false){
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
