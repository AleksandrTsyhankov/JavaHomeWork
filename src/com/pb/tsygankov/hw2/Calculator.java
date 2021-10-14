package com.pb.tsygankov.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        operand1 = in.nextInt();

        System.out.print("Введите второе число: ");
        operand2 = in.nextInt();

        System.out.print("Введите операцию(+, -, \u00d7, \u00f7): ");
        String sign = in.nextLine();
        
        switch(sign) {
            case "+":
                System.out.print("Результат операции: "+(operand1 + operand2));
                break;
            case "-":
                System.out.print("Результат операции: "+(operand1 - operand2));
                break;
            case "*":
                System.out.print("Результат операции: "+(operand1 * operand2));
                break;
            case "/":
                if(operand2 == 0) {
                    System.out.print("Деление на 0 запрещено.");
                    break;
                }
                System.out.print("Результат операции: "+(operand1 / operand2));
                break;
        }
    }
}

