package ARRAYS;

public class zad09 {
    public static void main(String[] args) {
        int[][] tablica9 = new int[][] {
    { 0, 1, 0, 1 },
    { 0, 1, 0, 2 },
    { 0, 2, 0, 2 },
    { 0, 1, 0, 2 },
    { 0, 1, 0, 1 },
    { 0, 1, 0, 2 },
    { 0, 2, 0, 2 },
    { 0, 1, 0, 2 }
};
        int count = 0;
        int count2 = tablica9.length;
        for(int[] tab : tablica9){
            for(int x : tab){
                if(x == 2) {
                    count += 1;
                    break;
                }
            }
            for(int x : tab){
                if(x == 1) {
                    count2 -= 1;
                    break;
                }
            }
        }
        System.out.println(count);
        System.out.println(count2);

    }
}
