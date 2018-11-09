package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollections {


    public static void main(String[] args) {

        Set<Integer> hash = new HashSet<>();
        Set<Integer> tree = new TreeSet<>();
        Set<Integer> linked = new LinkedHashSet<>();

        addToSet(hash);
        addToSet(tree);
        addToSet(linked);

    }


    public static void addToSet(Set set) {
        set.add(8);
        set.add(2);
        set.add(1);
        set.add(5);

        set.add(2);

        System.out.println(set);
    }

}
