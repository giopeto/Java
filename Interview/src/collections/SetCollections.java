package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollections {


    public static void main(String[] args) {

        // Duplicates are not allowed
        // Not ordered collection, except:
                    // LinkedHashSet which maintain insertion order
                    // TreeSet which maintain natural order


        Set<Integer> hash = new HashSet<>(); // no order
        Set<Integer> linked = new LinkedHashSet<>(); // insertion order
        Set<Integer> tree = new TreeSet<>(); // natural order

        addToSet(hash, "HashSet");
        addToSet(linked, "LinkedHashSet");
        addToSet(tree, "TreeSet");

    }


    public static void addToSet(Set set, String type) {
        set.add(8);
        set.add(2);
        set.add(100);
        set.add(5);

        set.add(2);

        System.out.println(set + " " + type);
    }

}
