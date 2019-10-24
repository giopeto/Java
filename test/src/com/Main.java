package com;

import com.test.abstractclasses.Animal;
import com.test.abstractclasses.Dog;
import com.test.finalclasses.Countdown;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Dog();
        Countdown countdown = new Countdown();

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e){
            System.out.println(e);
        } finally {
            System.out.println("Finally");
        }

    }
}
