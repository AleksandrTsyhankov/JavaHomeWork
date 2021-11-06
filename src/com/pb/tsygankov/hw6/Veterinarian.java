package com.pb.tsygankov.hw6;

public class Veterinarian {

    public void treatAnimal(Animal animal) {

        if(animal instanceof Dog) {
            System.out.println(((Dog) animal).getDogNickname() + " кушает " + animal.getFood());
            System.out.println(((Dog) animal).getDogNickname()  +  " живет в  " + animal.getLocation());
            System.out.println("----------------");
        }
        if(animal instanceof Cat) {
            System.out.println(((Cat) animal).getCatNickname() + " кушает " + animal.getFood());
            System.out.println(((Cat) animal).getCatNickname() +  " живет в  " + animal.getLocation());
            System.out.println("----------------");
        }
        if(animal instanceof Horse) {
            System.out.println(((Horse) animal).getHorseNickname() + " кушает " + animal.getFood());
            System.out.println(((Horse) animal).getHorseNickname() +  " живет в  " + animal.getLocation());
        }
    }
}
