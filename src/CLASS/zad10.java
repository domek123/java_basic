package CLASS;

import java.util.Arrays;

public class zad10 {
    public static void main(String[] args) {
        int[] p1 = {5,6};
        int[] p2 = {4,1};
        int[] p3 = {8,4};
        Triangle triangle = new Triangle();
        triangle.setSzukp(new int[]{5,5});
        triangle.DrawTriangle();

    }
}
class Triangle{
    private int[] p1;
    private int[] p2;
    private int[] p3;
    private int[] szukp = null;

    public void setSzukp(int[] szukp) {
        this.szukp = szukp;
    }

    public Triangle() {
        p1 = new int[]{0, 0};
        p2 = new int[]{10, 0};
        p3 = new int[]{0,10};
    }

    public Triangle(int[] p1, int[] p2, int[] p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void DrawTriangle(){
        String[][] tab = new String[10][10];
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                tab[i][j] = " ";
            }
        }

        for(int i = p1[0];i<p2[0];i++) {
            for (int j = p1[1]; j < p3[1]; j++) {
                if (j == 0 || i == 0) {
                    tab[i][j] = "*";
                }else if (i + j == 9) {
                    tab[i][j] = "*";
                }
            }
        }
        String info = "";
        if (szukp != null) {
            if(tab[szukp[0]][szukp[1]] == "*"){
                info = "punkt na boku trójkąta";
            }else if(szukp[0]+szukp[1]<9){
                info = "punkt wewnątrz";
            }else{
                info = "punkt na zewewnątrz";
            }
            tab[szukp[0]][szukp[1]] = "X";
        }
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                System.out.print(tab[i][j] + "  ");
            }
            System.out.println("");
        }
        if(szukp != null){
            System.out.println(info);
        }
    }


}
