package com.pb.tsygankov.hw6;

public class VetСlinic {
    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog ("кость","будке","гав", "Шарик");
        animals[1] = new Cat ("рыбу","квартире","мяу", "Мурзик");
        animals[2] = new Horse ("овёс","стойле","иго-го", "Буцефал");

        Class clazz = Class.forName("com.pb.tsygankov.hw6.Veterinarian");
        Object obj = clazz.getConstructor(new Class[]{}).newInstance();
        if (obj instanceof Veterinarian) {

            for (Animal animal : animals) {
                ((Veterinarian) obj).treatAnimal(animal);
            }
        }
    }
}
