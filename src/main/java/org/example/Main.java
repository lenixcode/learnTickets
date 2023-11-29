package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz q = new Quiz();

        System.out.println("Введите 1 если хотите добавить вопрос");
        System.out.println("Введите 2 если хотите начать игру");

        System.out.print("Куда пойдем: ");
        int option = new Scanner(System.in).nextInt();
        if(option==1) q.addQst();
        if(option==2) q.gameStart();;
    }
}