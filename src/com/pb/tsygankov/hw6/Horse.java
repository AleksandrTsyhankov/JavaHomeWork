package com.pb.tsygankov.hw6;
import java.util.Objects;

public class Horse extends Animal {
    private String horseSays;
    private String horseNickname;


    public Horse(String food, String location, String horseSays, String horseNickname) {
        super(food, location);
        this.horseSays = horseSays;
        this.horseNickname = horseNickname;
    }

    public String getHorseSays() {
        return horseSays;
    }

    public void setHorseSays(String horseSays) {
        this.horseSays = horseSays;
    }

    public String getHorseNickname() {
        return horseNickname;
    }

    public void setHorseNickname(String horseNickname) {
        this.horseNickname = horseNickname;
    }

    @Override
    public void makeNoise() {
        System.out.println(horseNickname + " говорит " + horseSays);
    }

    @Override
    public void eat() {
        System.out.println(horseNickname + " кушает " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println(horseNickname + " спит в " + getLocation());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(horseSays, horse.horseSays) && Objects.equals(horseNickname, horse.horseNickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horseSays, horseNickname);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "horseSays='" + horseSays + '\'' +
                ", horseNickname='" + horseNickname + '\'' +
                '}';
    }

    public void newHorse(){
        System.out.println("Лошадка добавлена в метод");
    }
}
