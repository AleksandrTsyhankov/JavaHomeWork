package com.pb.tsygankov.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes [] clothes = new Clothes[4];
        clothes [0] = new Tshirt(Size.L,1000, "Белый");
        clothes [1] = new Pants(Size.M, 1500, "Серый");
        clothes [2] = new Skirt(Size.XS, 1700, "Красный");
        clothes [3] = new Tie(Size.XXS, 500,"Черный");

        dressMan (clothes);
        dressWoman (clothes);

    }
    public static void dressMan(Clothes[] clothes)
    {   System.out.println("Мужская одежда:");
        for (Clothes c:clothes){
            if (c instanceof ManClothes) ((ManClothes) c).dressMan();}
    }
    public static void dressWoman(Clothes[] clothes)
    {   System.out.println("Женская одежда:");
        for (Clothes c:clothes){
            if (c instanceof WomenClothes) ((WomenClothes ) c).dressWomen();}
    }
}
