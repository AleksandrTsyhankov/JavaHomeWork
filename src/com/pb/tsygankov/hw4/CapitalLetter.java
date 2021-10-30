package com.pb.tsygankov.hw4;
import java.util.Scanner;


public class CapitalLetter {
    static String firstLettersToUppercase() {
        Scanner in = new Scanner(System.in);
        StringBuilder buf = new StringBuilder();
        String phrase;


        System.out.print("Введите слово или фразу с маленькой буквы для преобразования: ");
        phrase = in.nextLine();


        String[] arr = phrase.split(" ");

        for (int i = 0; i < arr.length; i++) {
            buf.append(arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase()).append(" ");
        }

        String newPhrase = buf.toString();

        return newPhrase;
    }

    public static void main(String[] args) {

        System.out.println(firstLettersToUppercase());

    }
}