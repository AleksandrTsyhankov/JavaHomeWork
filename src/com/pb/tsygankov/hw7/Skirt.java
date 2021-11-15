package com.pb.tsygankov.hw7;

public class Skirt extends Clothes implements WomenClothes {
    private String typeOfDressWoman = "Юбка";

    public Skirt (Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println(typeOfDressWoman + " Размер: " + getSize() + " Цена: " + getPrice() + " Цвет: " + getColor());
    }
}
