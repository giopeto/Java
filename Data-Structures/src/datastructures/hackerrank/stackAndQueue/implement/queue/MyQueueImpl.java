package datastructures.hackerrank.stackAndQueue.implement.queue;

import datastructures.hackerrank.stackAndQueue.implement.Node;

public class MyQueueImpl implements MyQueue {

    private Node tail; // add
    private Node head; // remove

    @Override
    public void add(Object data) {
        Node node = new Node(data);

        if(tail != null) {
            tail.setNext(node);
        }
        tail = node;

        if(head == null) {
            head = node;
        }
    }

    @Override
    public Object remove() {
        Object data = head.getData();
        head = head.getNext();
        if(head == null) {
            tail = null;
        }
        return data;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
