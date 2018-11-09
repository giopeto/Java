package modifiers;

public class Protected {

    public static void main(String[] args) {
        A a = new A();
        a.print();

        A b = new B();
        b.print();
    }
}


class A {
    protected void print() {
        System.out.println("Protected print");
    }
}


class B extends A {

}
