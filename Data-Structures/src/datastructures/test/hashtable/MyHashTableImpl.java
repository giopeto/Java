package datastructures.test.hashtable;

import java.util.LinkedList;

public class MyHashTableImpl<K, V> implements MyHashTable<K, V> {
    private int size = 50;
    private LinkedList<Node>[] data = new LinkedList[size];

    @Override
    public void add(K key, V value) {
        Node node = new Node(key, value);
        int hash = getHashCode(key);

        if(data[hash] == null) {
            data[hash] = new LinkedList<Node>(){{
                add(node);
            }};
        } else {
            boolean insert = true;
            for(Node n : data[hash]) {
                if(n.getKey().equals(key)) {
                    n.setValue(value);
                    insert = false;
                }
            }

            if(insert) {
                data[hash].add(node);
            }
        }
    }

    @Override
    public V get(K key) {
        V value = null;
        LinkedList<Node> valuesList = data[getHashCode(key)];

        for(Node node : valuesList) {
           if (node.getKey().equals(key)) {
               value = (V) node.getValue();
               break;
           }
        }

        return value;
    }

    @Override
    public void remove(K key) {
        if(data[getHashCode(key)] != null) {
            LinkedList<Node> valuesList = data[getHashCode(key)];
            for(Node node : valuesList) {
                if (node.getKey().equals(key)) {
                    valuesList.remove(node);
                    break;
                }
            }
        }
    }

    @Override
    public void print() {
        System.out.println("*********** printAllValues *************");

        for(int i = 0; i< size; i++) {
            System.out.println("On index " + i + ".");
            if(data[i] != null) {
                data[i].stream()
                        .map(node-> "   " + node.getKey() + " " + node.getValue())
                        .forEach(System.out::println);
            }
        }

        System.out.println("****************************************");
    }

    private int getHashCode(K key) {
        return Integer.parseInt(key.toString()) % size;
    }
}
