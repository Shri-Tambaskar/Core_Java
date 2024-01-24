package com.mkpits.collection;

import java.util.HashSet;
import java.util.Set;

public class Example13_HashSet {

	public static void main(String[] args) {

		Set<String> colorSet = new HashSet<String>();
		System.out.println(colorSet.add("Red"));
		System.out.println(colorSet.add("Green"));
		System.out.println(colorSet.add("Blue"));
		System.out.println(colorSet.add("Blue"));

	}

}
