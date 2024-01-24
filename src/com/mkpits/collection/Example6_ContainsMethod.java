package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Example6_ContainsMethod {

	public static void main(String[] args) {
		// Creating an object of List interface,
		// implemented by ArrayList class
		List<String> al = new ArrayList<>();

		// Adding elements to object of List interface
		al.add("Geeks");
		al.add("For");
		al.add("Geeks");
		al.add("Nagpur");
		al.add("mkpits");

		// Checking if element is present using contains()
		// method
		boolean isPresent = al.contains("Geeks");

		// Printing the result
		System.out.println("Is Geeks present in the list? " + isPresent);

		System.out.println(al.equals("Geeks"));

		// Declare list iterator
		ListIterator listItr = al.listIterator();

		// Forward iterations
		System.out.println("Forward Traversal:");
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}

		// Backward iterations
		System.out.println("\nBackward Traversal:");
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}

	}

}
