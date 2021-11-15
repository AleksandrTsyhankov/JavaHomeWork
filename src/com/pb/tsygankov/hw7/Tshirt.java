package com.pb.tsygankov.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes  {
    private String typeOfDressMan = "Мужская футболка";
    private String typeOfDressWoman = "Женская футболка";

    public Tshirt (Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(typeOfDressMan + " Размер: " + getSize() + " Цена: " + getPrice() + " Цвет: " + getColor());
    }

    @Override
    public void dressWomen() {
        System.out.println(typeOfDressWoman + " Размер: " + getSize() + " Цена: " + getPrice() + " Цвет: " + getColor());
    }
}
