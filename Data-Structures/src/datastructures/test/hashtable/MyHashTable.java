package datastructures.test.hashtable;

public interface MyHashTable<K, V> {

    public void add(K key, V value);
    public V get(K key);
    public void remove(K key);
    public void print();
}
