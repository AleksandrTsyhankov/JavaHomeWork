package com.pb.tsygankov.hw4;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    static String detectAnagramma() {
        Scanner in = new Scanner(System.in);


        System.out.print("Введите первую фразу: ");
        String phrase1 = in.nextLine();
        System.out.print("Введите вторую фразу: ");
        String phrase2 = in.nextLine();

        char[] arr1 = phrase1.toCharArray();
        char[] arr2 = phrase2.toCharArray();

        Arrays.sort(arr1);
        String sortedString1 = new String(arr1);
        Arrays.sort(arr2);
        String sortedString2 = new String(arr2);

        String result = sortedString1.equals(sortedString2)
                ? "Строка 1 является анаграммой строки 2"
                : "Строка 1 НЕ является анаграммой строки 2";

        return result;
    }

    public static void main(String[] args) {
        System.out.println(detectAnagramma());
    }
}
