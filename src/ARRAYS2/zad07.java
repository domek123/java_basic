package ARRAYS2;

import java.util.Arrays;

public class zad07 {
    public static void main(String[] args) {

        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = 100;
            }
        }

        String kierunek = "r";
        int counter = 0;
        int x = 0;
        int y = 0;
        while (true) {
            switch (kierunek) {
                case "r":
                    if (x + 1 == 10) {
                        kierunek = "d";
                    } else if (arr[y][x + 1] != 100) {
                        kierunek = "d";
                    }
                    break;
                case "d":
                    if (y + 1 == 10) {
                        kierunek = "l";
                    } else if (arr[y + 1][x] != 100) {
                        kierunek = "l";
                    }
                    break;
                case "l":
                    if (x - 1 == -1) {
                        kierunek = "u";
                    } else if (arr[y][x - 1] != 100) {
                        kierunek = "u";
                    }
                    break;
                case "u":
                    if (y - 1 == -1) {
                        kierunek = "r";
                    } else if (arr[y - 1][x] != 100) {
                        kierunek = "r";
                    }
                    break;
            }


            arr[y][x] = counter;
            counter++;

            if (kierunek == "r") {
                x++;
            } else if (kierunek == "d") {
                y++;
            } else if (kierunek == "l") {
                x--;
            } else if (kierunek == "u") {
                y--;
            }
            if(counter == 100){
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + (j != 9 ? "\t" : "\n"));
            }
        }
    }}
