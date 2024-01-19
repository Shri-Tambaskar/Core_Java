package com.mkpits.collection;

import java.util.ArrayList;

public class Example3_IndexOf {

	public static void main(String[] args) {

		// create a list of integers
		ArrayList<Integer> list = new ArrayList<Integer>();

		// add some integers to the list
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(3);

		// use indexOf() to find the first occurrence of an
		// element in the list

		int index = list.indexOf(1);
		System.out.println("Index of 1 is " + index);// 0

		// use lastIndexOf() to find the last occurrence of
		// an element in the list

		int lastIndex = list.lastIndexOf(3);
		System.out.println("Index of 3 " + lastIndex);// 4

		System.out.println(list.lastIndexOf(1));//
		System.out.println(list.indexOf(3));// 2

	}

}
