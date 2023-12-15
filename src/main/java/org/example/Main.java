package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();;
        int mode = 0;

        while (mode!=3){
            System.out.println("Выберите опцию(номер):");
            System.out.println("    1.Начать игру");
            System.out.println("    2.Составить список слов");
            System.out.println("    3.Выйти");
            System.out.print("Куда пойдем: ");
            mode = new Scanner(System.in).nextInt();


            if (mode == 1) {
                quiz.createQstBase();
                quiz.gameStart();
            }
            if (mode == 2){
                quiz.addQst();
                quiz.createQstBase();
            }
        }
    }
}