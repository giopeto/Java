package com.collections;

import java.util.*;

/**
 * Created by George on 18.2.2017 г..
 */
public class Set {

	public static void main(String[] args) {

		/* HashSet
		*  1. Order: no
		*  2. Duplicates: no
		*  3. Null: yes (only one)
		*
		* */

		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("A 7");
		hashSet.add("A 7");hashSet.add("A 7");hashSet.add("A 7");hashSet.add("A 7");hashSet.add("A 7");hashSet.add("A 7");
		hashSet.add("A 4");
		hashSet.add("A 2");
		hashSet.add("A 3.1");
		hashSet.add(null);
		hashSet.add(null);

		hashSet.add("Apple");
		hashSet.add("Mango");
		hashSet.add("Grapes");
		hashSet.add("Orange");
		hashSet.add("Fig");

		System.out.println("HashSet: " + hashSet);

		/* TreeSet
		*  1. Order: natural order
		*  2. Duplicates: no
		*  3. Null: no
		*
		* */
		TreeSet<String> treeSet = new TreeSet<>();

		treeSet.add("A 3");
		treeSet.add("A 2");
		treeSet.add("A 1");
		treeSet.add("A 4");treeSet.add("A 4");treeSet.add("A 4");
		//treeSet.add(null);
		//treeSet.add(null);

		System.out.println("TreeSet: " + treeSet);

		/* LinkedHashSet
		*  1. Order: order of insertion
		*  2. Duplicates: no
		*  3. Null: yes (only one)
		*
		* */
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();

		// Adding elements to the LinkedHashSet
		lhset.add("Z");
		lhset.add("PQ");lhset.add("PQ");lhset.add("PQ");lhset.add("PQ");
		lhset.add("N");
		lhset.add("O");
		lhset.add("KK");
		lhset.add("FGH");
		lhset.add(null);
		lhset.add(null);
		System.out.println("LinkedHashSet: " + lhset);


	}



}
