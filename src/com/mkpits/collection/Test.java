package com.mkpits.collection;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(10);
		list.add(23);
		list.add(0);
		list.add(87);

		for (int i = 0; i < list.size(); i++) {
			list.remove(i);
			System.out.println(list);
		}

		Object[] a = list.toArray();
		System.out.print("After converted LinkedList to Array: ");
		for (Object element : a)
			System.out.print(element + " ");
	}

}
