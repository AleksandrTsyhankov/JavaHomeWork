package com.pb.tsygankov.hw10;

public class Main {
    public static void main (String[] args) throws Exception {
        NumBox<Integer> intNumBox = new NumBox<Integer>(5);

        intNumBox.add(1);
        intNumBox.add(2);
        intNumBox.add(3);
        intNumBox.add(4);
        intNumBox.add(5);

        System.out.println("***Выводим элементы массива с целыми числами***");
        for(int i = 0; i < intNumBox.length(); i++) {
            System.out.println(intNumBox.get(i));
        }
        System.out.println("Сумма элементов массива с целыми числами: " + intNumBox.sum());
        System.out.println("Среднее значение массива с целыми числами: " + intNumBox.average());

        NumBox<Float> floatNumBox = new NumBox<Float>(5);

        floatNumBox.add((float) 12.2);
        floatNumBox.add((float) 1.2);
        floatNumBox.add((float) 5.2);
        floatNumBox.add((float) 2.2);
        floatNumBox.add((float) 9.5);

        System.out.println("\n***Выводим элементы массива с дробными числами***");
        for(int i = 0; i < floatNumBox.length(); i++) {
            System.out.println(floatNumBox.get(i));
        }
        System.out.println("Сумма элементов массива с дробными числами: " + String.format("%.3g%n", floatNumBox.sum()).trim());
        System.out.println("Среднее значение массива с дробными числами: " + String.format("%.3g%n", floatNumBox.average()).trim());
    }
}
