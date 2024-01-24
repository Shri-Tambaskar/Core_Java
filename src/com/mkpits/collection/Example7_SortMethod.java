package com.mkpits.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Example7_SortMethod {

	public static void main(String[] args) {
		// create a list of integers
		ArrayList<Integer> list = new ArrayList<>();

		// add some integers to the list
		list.add(-1);
		list.add(32);
		list.add(0);
		list.add(56);
		list.add(3);

		/*
		 * Collections.sort method is sorting the elements of ArrayList in ascending
		 * order.
		 */
		Collections.sort(list);

		// Let us print the sorted list
		System.out.println("List after the use of" + " Collection.sort() :\n" + list);

		/*
		 * Collections.sort method is sorting the elements of ArrayList in ascending
		 * order.
		 */
		Collections.sort(list, Collections.reverseOrder());

		// Let us print the sorted list
		System.out.println("List after the use of" + " Collection.sort() :\n" + list);

	}

}
