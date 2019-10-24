package com.test.oop;

public class AnimalServiceImpl implements AnimalService {
    @Override
    public boolean isPredator(String name) {
        switch (name) {
            case "cat":
                return false;
            case "wolf":
                return true;
            default:
                return false;
        }
    }
}
