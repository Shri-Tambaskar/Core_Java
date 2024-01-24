package com.mkpits.collection;

import java.util.HashSet;
import java.util.Set;

public class Example9_HashSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("mkpits");
		set.add("nagpur");
		set.add("munje square");
		set.add("nagpur");
		set.add("sitabardi");

		System.out.println(set);
		set.forEach(System.out::println);

	}

}
