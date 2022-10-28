package klasy;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Osoba o = new Osoba();
        o.init();
    }
}
class Osoba {
    private String imie;
    private String nazwisko;
    private String miasto;
    private String kod;
    Scanner scan = new Scanner(System.in);

    public void init(){
        System.out.println("zad 05");

        System.out.println("podaj imie");
        imie = scan.nextLine();
        System.out.println("podaj nazwisko");
        nazwisko = scan.nextLine();
        System.out.println("podaj miasto");
        miasto = scan.nextLine();
        System.out.println("podaj kod");
        do{
            kod = scan.nextLine();
            if(!checkCode()){
                System.out.println("bledny kod");
            }else{
                System.out.println(display());
                break;
            }
        }while(true);

    }
    private String display(){
        return "imie: " + imie +"\nnazwisko: " + nazwisko + "\nmiasto: " + miasto + "\nkod: " + kod;
    }
    private boolean checkCode(){
        if(kod.length()==6 && kod.charAt(2) == '-'){
            return true;
        }else{
            return false;
        }
    }
}
