package com.mkpits.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example10_Mathematics {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

		// To find union ----- print all elements and remove duplicate elements
		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.print("Union of the two Set");
		System.out.println(union);

		// To find intersection ----print common Elements
		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.print("Intersection of the two Set");
		System.out.println(intersection);

		// To find the symmetric difference
		Set<Integer> difference = new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.print("Difference of the two Set");
		System.out.println(difference);

		System.out.println(set2);
	}

}
