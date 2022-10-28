package klasy;

import java.util.Objects;
import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clock c1 = new Clock(10,10) ;
        Clock c2 = new Clock(10,10) ;
        System.out.println(c1.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println("podaj liczbe minut do dodania");
        c1.addMinutes(scanner.nextInt());
        System.out.println(c1);
        c1.subMinutes(scanner.nextInt());
        System.out.println(c1);

    }
}
class Clock{
    private int hour;
    private int minutes;

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public Clock(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }
    public void addMinutes(int m){
        if(minutes + m>59){
            hour += m/60;
            minutes += m%60 ;
        }
    }
    public void subMinutes(int m){
        if(minutes-m<0){
            hour -= m/60+1;
            minutes -= m%60;
            minutes += 60;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clock clock = (Clock) o;
        return hour == clock.hour && minutes == clock.minutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minutes);
    }

    @Override
    public String toString() {
        return "jest godzina: " + hour + ":" + minutes;
    }
}
