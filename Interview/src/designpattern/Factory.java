package designpattern;

public class Factory {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal dog = animalFactory.makeAnimal("dog");
        Animal cat = animalFactory.makeAnimal("cat");
        dog.sayHi();
        cat.sayHi();
    }
}

interface Animal {

    public void sayHi();
}

class Dog implements Animal {

    @Override
    public void sayHi() {
        System.out.println("Dog say hi");
    }
}

class Cat implements Animal {

    @Override
    public void sayHi() {
        System.out.println("Cat say hi");
    }
}

class AnimalFactory {

    public Animal makeAnimal(String animalType) {
        if(animalType.equals("cat")) {
            return new Cat();
        } else {
            return new Dog();
        }
    }
}
