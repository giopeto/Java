package com.collections;

import java.util.*;

/**
 * Created by George on 18.2.2017 г..
 */
public class Map {
	/* Map interface not extends Collection interface. Set and List extend it. */

	public static void main(String[] args) {

		/* HashMap
		*  1. Order: no
		*  2. Duplicates: (key: no, value: yes)
		*  3. Null key: yes

		* */

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(12, "Chaitanya");
		hmap.put(15, "Chaitanya");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Ajeet");
		hmap.put(3, "Anuj");
		hmap.put(null, "Anuj");

		System.out.println("HashMap: " + hmap);

		/* TreeMap
		*  1. Order: natural by key
		*  2. Duplicates: (key: no, value: yes)
		*  3. Null key: no
		* */

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

		tmap.put(1, "Data1");
		tmap.put(100, "Data1");
		tmap.put(23, "Data2");
		tmap.put(70, "Data3");
		tmap.put(4, "Data4");
		tmap.put(2, "Data5");
		//tmap.put(null, "Data5");

		System.out.println("TreeMap: " + tmap);

		/* LinkedHashMap
		*  1. Order: order of insertion
		*  2. Duplicates: (key: no, value: yes)
		*  3. Null key: yes
		* */

		LinkedHashMap<Integer, String> lhmap =
				new LinkedHashMap<Integer, String>();

		//Adding elements to LinkedHashMap
		lhmap.put(22, "Abey");
		lhmap.put(33, "Dawn");
		lhmap.put(1, "Sherry");
		lhmap.put(2, "Karon");
		lhmap.put(100, "Jim");
		lhmap.put(null, "Jim1");
		lhmap.put(null, "Jim2");

		System.out.println("LinkedHashMap: " + lhmap);

	}


}
