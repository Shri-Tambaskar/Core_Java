package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class Example2_AddMethod {

	public static void main(String[] args) {

		// Creating an object of List interface,
		// implemented by ArrayList class
		List<String> al = new ArrayList<>();

		// Adding elements to object of List interface
		// Custom elements
//		al.addFirst("Hello");
		al.add("Technocrats");
		al.add("Solutions");
		al.add(1, "@");

//		StringJoiner joiner = new StringJoiner(" # ");
//		joiner.add(al.get(0)).add(al.get(1));
//
//		System.out.println(joiner);
//		// Print all the elements inside the
//		// List interface object
//		System.out.println(al);
//		al.clear();
//		System.out.println(al);

		System.out.println(al.contains("Technocrats"));
		System.out.println();

	}

}
