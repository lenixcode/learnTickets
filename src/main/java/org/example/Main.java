package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите номер предмета:");
        System.out.println(
                "   1.Иностранный язык\n"+
                "   2.Математический анализ\n"+
                "   3.Линейная алгебра");

        System.out.print("Куда пойдем: ");

        int option = new Scanner(System.in).nextInt();
        if(option != 1 ){
            System.out.println("Простите, но он еще не готов:(");
        }else{
            new Quiz().gameStart();
        }
    }
}