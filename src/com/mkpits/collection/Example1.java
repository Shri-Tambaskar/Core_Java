package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {

		// Creating an object of List interface
		// implemented by the ArrayList class
		List<Integer> l1 = new ArrayList<Integer>();

		// Adding elements to object of List interface
		// Custom inputs

		l1.add(0, 1);// index 0 value is 1
		l1.add(1, 2);// index 1 value 2

		// Print the elements inside the object
		System.out.println(l1);

//        // Now creating another object of the List
//        // interface implemented ArrayList class
//        // Declaring object of integer type
		List<Integer> l2 = new ArrayList<Integer>();
// 
//        // Again adding elements to object of List interface
//        // Custom inputs
		l2.add(1);// index 0
		l2.add(2);// index 1
		l2.add(3);// index 2
// 
//        // Will add list l2 from 1 index
		l1.addAll(1, l2);
// 
		System.out.println(l1);
//		System.out.println(l1.size());
// 
//        // Removes element from index 1
		l1.remove(1);
// 
//        // Printing the updated List 1
		System.out.println(l1);
// 
//        // Prints element at index 3 in list 1
//        // using get() method
		System.out.println(l1.get(3));
// 
//        // Replace 0th element with 5
//        // in List 1
		l1.set(0, 5);
// 
//        // Again printing the updated List 1
		System.out.println(l1);

//		Operation 1: Adding elements to List class using add() method
//		Operation 2: Updating elements in List class using set() method
//		Operation 3: Searching for elements using indexOf(), lastIndexOf methods
//		Operation 4: Removing elements using remove() method
//		Operation 5: Accessing Elements in List class using get() method
//		Operation 6: Checking if an element is present in the List class using contains() method
	}
}
