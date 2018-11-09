package datastructures.hackerrank.stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

// LIFO
public class Queues {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();

        queue.add(1);
        queue.add(2);

        int peekEl = queue.peek();
        int getEl = queue.remove();

        System.out.println(peekEl + " " + getEl);

        System.out.println("Foreach");
        queue.forEach(i -> System.out.println(i));
    }
}
