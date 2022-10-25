package ARRAYS2;

public class zad02 {
    public static void main(String[] args) {
        int [][]  t2 = new int[10][10];
        int suma = 0;
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                if(i==j){
                    t2[i][j] = i;
                    System.out.print(i + " ");
                    suma += i;
                }else{
                    System.out.print(0 + " ");
                    t2[i][j] = 0;
                }
            }
            System.out.println();
        }
        System.out.println(suma);
    }
}
