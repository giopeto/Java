package datastructures.hackerrank.stackAndQueue;

import java.util.Stack;

// FIFO
public class Stacks {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("1");
        stack.push(new Object());


        System.out.println(stack.size());
        System.out.println(stack.get(0));
        System.out.println(stack.get(0));


        /*System.out.println(stack.pop());
        System.out.println(stack.pop());*/
    }
}