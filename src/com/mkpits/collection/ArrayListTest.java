package com.mkpits.collection;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		// Non gfeneric version
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("mkpits");
		list.add(78.9);
		list.add(true);

		for (Object object : list) {
			System.out.println(object);
		}

		// Generic version with type safety
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		intArr.add(1);
//		intArr.add("mkpits");
//		intArr.add(78.9);
//		intArr.add(true);
	}

}
