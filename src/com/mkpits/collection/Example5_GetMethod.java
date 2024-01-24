package com.mkpits.collection;

import java.util.ArrayList;

public class Example5_GetMethod {

	public static void main(String[] args) {
		// create a list of integers
		ArrayList<Integer> list = new ArrayList<Integer>();

		// add some integers to the list
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(3);

		int first = list.get(0);
		System.out.println(first);
		System.out.println(list);

		boolean result = list.get(2).equals(2);
		System.out.println(result);

		System.out.println(list.listIterator(2));

	}

}
