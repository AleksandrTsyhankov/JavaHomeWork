package com.pb.tsygankov.hw7;

public class Tie extends Clothes implements ManClothes {
    private String typeOfDressMan = "Галстук";

    public Tie (Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(typeOfDressMan + " Размер: " + getSize() + " Цена: " + getPrice() + " Цвет: " + getColor());
    }
}
