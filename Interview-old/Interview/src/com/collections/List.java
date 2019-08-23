package com.collections;


import java.util.*;

/**
 * Created by George on 18.2.2017 г..
 */
public class List {

	public static void main(String[] args) {

		/* ArrayList
		*  1. Order: order of insertion
		*  2. Duplicates: yes
		*  3. Null: yes
		*
		*  Iteration and search are faster then linkedList but insert/deletion are slower
		*
		* */

		ArrayList<String> list = new ArrayList<>();
		list.add("A 1");
		list.add("A 2");
		list.add(0, "Add to zero");
		list.add(2, "Add to two");
		list.add(2, "Add to two second time");
		list.add("A 3 dups");
		list.add("A 3 dups");
		list.add(null);
		list.add(null);
		System.out.println("ArrayList: " + list);

		/*LinkedList
		* 	Same as arrylist
		*
		*	If there is a requirement of frequent addition and deletion in application then LinkedList is a best choice.
		* */



		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(3);
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(null);
		linkedList.add(null);
		System.out.println("LinkedList: " + linkedList);

	}
}
