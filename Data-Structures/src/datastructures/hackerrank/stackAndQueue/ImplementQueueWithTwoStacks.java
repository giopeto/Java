package datastructures.hackerrank.stackAndQueue;

import java.util.Stack;

public class ImplementQueueWithTwoStacks<T> {

    private Stack<T> addHereStack = new Stack();
    private Stack<T> getFromHereStack = new Stack();

    public void enqueue(T value) { // add item
        addHereStack.add(value);
    }

    public T peek() { // get item
        check();
        return getFromHereStack.peek();
    }

    public T dequeue() { // get item and remove it
        check();
        return getFromHereStack.pop();
    }

    private void check() {
        if(getFromHereStack.isEmpty()) {
            while(!addHereStack.isEmpty()){
                getFromHereStack.add(addHereStack.pop());
            }
        }
    }

    public static void main(String[] args) {
        ImplementQueueWithTwoStacks<Integer> queueWithTwoStacks = new ImplementQueueWithTwoStacks<>();
        queueWithTwoStacks.enqueue(1);
        queueWithTwoStacks.enqueue(2);
        queueWithTwoStacks.enqueue(3);
        queueWithTwoStacks.enqueue(4);

        System.out.println(queueWithTwoStacks.dequeue());
        System.out.println(queueWithTwoStacks.dequeue());
        System.out.println(queueWithTwoStacks.dequeue());
        System.out.println(queueWithTwoStacks.dequeue());
    }
}
