package datastructures.hackerrank.stackAndQueue.implement.stack;

import datastructures.hackerrank.stackAndQueue.implement.Node;

public class MyStackImpl implements MyStack {

    private Node top;

    @Override
    public void push(Object nodeData) {
        Node node = new Node(nodeData);
        node.setNext(top);
        top = node;
    }

    @Override
    public Object pop() {
        Object popNode = peek();
        top = top.getNext();
        return popNode;
    }

    @Override
    public Object peek() {
        return top.getData();
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
