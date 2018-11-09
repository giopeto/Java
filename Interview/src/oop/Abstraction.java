package oop;

/*
* abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user.
* In other words, the user will have the information on what the object does instead of how it does it.
*
* */
public class Abstraction {


    public static void main(String[] args) {
        C c = new C();
        c.displayFromB();
        c.display1();

        System.out.println("*******************************");

        D d = new D();
        d.displayFromA();
        d.displayFromAB();

        A a = new A() {
            @Override
            public void displayFromA() {
                super.displayFromA();
            }
        };

        B b = new B() {
            @Override
            void display1() {
                System.out.println("aa");
            }
        };
    }

}


abstract class A {
    public void displayFromA() {
        System.out.println("Display A");
    }
}

abstract class B {
    abstract void display1();

    public void displayFromB() {
        System.out.println("Display B");
    }
}

abstract class AB extends A {
    public void displayFromAB() {
        System.out.println("Display AB");
    }
}

class C extends B {
    @Override
    void display1() {
        System.out.println("Overiden abstract method");
    }
}

class D extends AB {}