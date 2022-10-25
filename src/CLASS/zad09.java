package CLASS;

import java.sql.Array;
import java.util.Arrays;

public class zad09 {
    public static void main(String[] args) {;
        MyPoint point1 = new MyPoint(0,0);
        System.out.println(Arrays.toString(point1.returnArr()));
        MyPoint point2 = new MyPoint(3,4);
        System.out.println(point2.distFromPoint(point1));
        MyPoint point3 = new MyPoint(5,6);
        System.out.println(point3.distFromPoint(point2));
        MyPoint point4 = new MyPoint(10,10);
        System.out.println(point4.distFromCoords(11,11));
    }
}
class MyPoint{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int[] returnArr(){
        int ar[] = {x,y};
        return ar;
    }
    public double distFrom0(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public double distFromCoords(int x,int y){
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
    }
    public double distFromPoint(MyPoint p){
        return Math.sqrt(Math.pow((this.x-p.getX()),2)+Math.pow((this.y-p.getY()),2));
    }
}
