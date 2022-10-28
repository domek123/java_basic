package klasy;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class test06 {
    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println(robot.getName());
        System.out.println(robot.getName());
        for (int i = 0; i <10 ; i++) {
            robot.reset();
            System.out.println(robot.getName());
        }
    }
}
class Robot{
    private String name;
    private static Set<String> setName = new HashSet<>() ;

    public String getName() {
        return name;
    }
    public Robot(){
        generateName();
    }
    private void generateName(){
        Random rand = new Random();
        String text = " ";
        int x = rand.nextInt(25) + 65;
        text += (char)x;
        x = rand.nextInt(25) + 65;
        text += (char)x;
        text+= "-";
        for(int i = 0; i<3;i++){
            x = rand.nextInt(10);
            text += x;
        }
        if(!setName.contains(name)){
            name = text;
            setName.add(name);

        }else{
            generateName();
        }
    }
    public void reset(){
        setName.remove(name);
        generateName();
    }
}
