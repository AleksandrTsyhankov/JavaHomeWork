package com.pb.tsygankov.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        int upperbound = 5;
        int hiddenNumber = random.nextInt(upperbound);
        int userNumber = 0;

        Scanner in = new Scanner(System.in);

        System.out.println(
                "Угадайте число, которое загадала программа. \n " +
                "У Вас есть 100 попыток. \n " +
                "Для выхода из игры введите \"-1\" " +
                "\n");

        for(int counter = 1; counter <= 5; counter++) {

            System.out.print((counter) + "-я попытка: ");
            userNumber = in.nextInt();


            if(userNumber == -1) {
                System.out.println("Игра завершена.");
                break;
            }
            else if(userNumber == hiddenNumber) {
                System.out.println("Поздравляем! Вы угадали число с " + (counter) + " попытки");
                break;
            }
            else if(userNumber != hiddenNumber && counter < 20) {
                String answerToUser =  (userNumber < hiddenNumber)
                        ? "Загаданное число больше того, которое Вы ввели"
                        : "Загаданное число меньше того, которое Вы ввели";
                System.out.println(answerToUser);
                continue;
            }

            System.out.println("К сожалению Вы проиграли");
        }
    }
}
