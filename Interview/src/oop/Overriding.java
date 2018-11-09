package oop;

public class Overriding {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.move();
        dog.move();
    }
}

class Animal {

    public void move() {
        System.out.println("Animal move");
    }
}

class Dog extends Animal {

    public void move() {
        System.out.print("Call super from Dog: ");
        super.move();
        System.out.println("Dog move and override animal move() method");
    }
}