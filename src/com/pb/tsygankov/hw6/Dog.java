package com.pb.tsygankov.hw6;
import java.util.Objects;

public class Dog extends Animal {
    private String dogSays;
    private String dogNickname;

    public Dog(String food, String location, String dogSays, String dogNickname) {
        super(food, location);
        this.dogSays = dogSays;
        this.dogNickname = dogNickname;
    }

    public String getDogSays() {
        return dogSays;
    }

    public void setDogSays(String dogSays) {
        this.dogSays = dogSays;
    }

    public String getDogNickname() {
        return dogNickname;
    }

    public void setDogNickname(String dogNickname) {
        this.dogNickname = dogNickname;
    }

    @Override
    public void makeNoise() {
        System.out.println(dogNickname +  " говорит " + dogSays);
    }

    @Override
    public void eat () {
        System.out.println(dogNickname + " кушает " + getFood());
    }

    @Override
    public void sleep () {
        System.out.println(dogNickname + " спит в " + getLocation());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(dogSays, dog.dogSays) && Objects.equals(dogNickname, dog.dogNickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogSays, dogNickname);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogSays='" + dogSays + '\'' +
                ", dogNickname='" + dogNickname + '\'' +
                '}';
    }
}
