package com.test.oop;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Wolf("wolf", 1, false);
        System.out.println(((Wolf) animal).sayHi());
        System.out.println(animal.isPredator(animal.name));
    }
}
