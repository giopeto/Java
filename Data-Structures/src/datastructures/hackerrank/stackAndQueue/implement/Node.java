package datastructures.hackerrank.stackAndQueue.implement;

public class Node {

    private Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }

    public Node getNext() {
        return this.next;
    }

    public Object getData() {
        return data;
    }
}
