package datastructures.hackerrank.stackAndQueue.implement.queue;

import datastructures.hackerrank.stackAndQueue.implement.Node;

import java.util.ArrayList;
import java.util.List;

public class MyQueueRecursiveImpl implements MyQueue {

    private Node top;

    @Override
    public void add(Object data) {
        Node node = new Node(data);

        node.setNext(top);
        top = node;
    }

    @Override
    public Object remove() {
        return getLastElementRecursively(top);
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    private Object getLastElementRecursively(Node node) {
        if(node.getNext() != null) {
            return getLastElementRecursively(node.getNext());
        } else {
            recreateTop();
            return node.getData();
        }
    }

    private void recreateTop() {
        List<Node> topList = new ArrayList();

        while(top.getNext() != null) {
            topList.add(top);
            top = top.getNext();
        }

        top = null;

        for(int i = topList.size() -1; i >= 0; i--) {
            add(topList.get(i).getData());
        }
    }
}
