package com.pb.tsygankov.hw6;
import java.util.Objects;

public class Cat extends Animal {
    private String catSays;
    private String catNickname;

    public Cat(String food, String location, String catSays, String catNickname) {
        super(food, location);
        this.catSays = catSays;
        this.catNickname = catNickname;
    }

    public String getCatSays() {
        return catSays;
    }

    public void setCatSays(String catSays) {
        this.catSays = catSays;
    }

    public String getCatNickname() {
        return catNickname;
    }

    public void setCatNickname(String catNickname) {
        this.catNickname = catNickname;
    }

    @Override
    public void makeNoise() {
        System.out.println(catNickname +  " говорит " + catSays);
    }

    @Override
    public void eat () {
        System.out.println(catNickname + " кушает " + getFood());
    }

    @Override
    public void sleep () {
        System.out.println(catNickname + " спит в " + getLocation());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(catSays, cat.catSays) && Objects.equals(catNickname, cat.catNickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catSays, catNickname);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catSays='" + catSays + '\'' +
                ", catNickname='" + catNickname + '\'' +
                '}';
    }

    public void newCat(){
        System.out.println("Кошечка добавлена в метод");
    }
}
