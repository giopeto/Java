package com.test.oop;

public class Animal implements AnimalService{

    public String name;
    private int age;
    private boolean isFly;
    private AnimalServiceImpl animalService = new AnimalServiceImpl();

    public Animal(String name, int age, boolean isFly) {
        this.name = name;
        this.age = age;
        this.isFly = isFly;
    }

    protected String sayHi() {
        return "Hi";
    }

    @Override
    public boolean isPredator(String name) {
        return animalService.isPredator(name);
    }
}