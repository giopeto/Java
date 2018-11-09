package datastructures.hackerrank.stackAndQueue.implement.stack;

public class TestMyStackImpl {

    public static void main(String[] args) {
        MyStack myStack = new MyStackImpl();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }
}
