package com.pb.tsygankov.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int userNumber;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите любое число: ");
        userNumber = in.nextInt();

        if(userNumber >= 0 && userNumber <= 14) {
            System.out.print("Ваше число попало в промежуток [0 -14]");
        }
        else if(userNumber >= 15 && userNumber <= 35) {
            System.out.print("Ваше число попало в промежуток [15 - 35]");
        }
        else if(userNumber >= 36 && userNumber <= 50) {
            System.out.print("Ваше число попало в промежуток [36 - 50]");
        }
        else if(userNumber >= 51 && userNumber <= 100) {
            System.out.print("Ваше число попало в промежуток [51 - 100]");
        }
        else {
            System.out.print("Ваше число не попало ни в один из имеющихся промежутков: [0 -14] [15 - 35] [36 - 50] [51 - 100].");
        }
    }
}
