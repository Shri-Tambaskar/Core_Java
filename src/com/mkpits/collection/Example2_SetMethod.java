package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class Example2_SetMethod {

	public static void main(String[] args) {
		// Creating an object of List interface,
		// implemented by ArrayList class
		List<String> al = new ArrayList<>();

		// Adding elements to object of List interface
		// Custom elements
		al.add("Technocrats");
		al.add("Solutions");
		al.add(1, "@");

		// Display the initial elements in List
		System.out.println("Initial ArrayList " + al);

		// Setting (updating) element at 1st index
		// using set() method
		al.set(1, "&");

		System.out.println("Updated ArrayList " + al);
	}

}
