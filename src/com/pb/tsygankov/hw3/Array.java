package com.pb.tsygankov.hw3;

import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        int positiveNumbs = 0;
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {
            System.out.print("Введите " +(i + 1)+ "-е число массива: ");
            array[i] = in.nextInt();
        }
        /*=====*/
        System.out.print("\n Введенный массив: ");
        for(int i = 0; i < array.length; i++) {
             System.out.print(array[i]);
        };
        /*=====*/
        for(int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        System.out.print("\n Сумма всех элементов массива: " + sum);
        /*=====*/
        for(int i=0; i < array.length; i++) {
           if(array[i]%2 == 0){
               positiveNumbs++;
            }
        }
        System.out.println("\n Количество положительных чисел в массиве: " + positiveNumbs);

        for(int i = 0; i < array.length - 1; i++) {
            for(int j = array.length - 1; j > i; j--){
                if(array[j] < array[j-1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    }
                }
            }

        System.out.print("\n Отсортированный массив: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
