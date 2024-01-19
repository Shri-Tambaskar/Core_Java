package com.mkpits.collection;

import java.util.ArrayList;

public class TypeSafety5 {

	public static void main(String[] args) {

		Integer[] arr = new Integer[10];
		arr[0] = 5;
		arr[1] = 7;
//		arr[2] = "mkpits"; // Compile time error

		Integer i = 20;
		// instance of
		System.out.println(i instanceof Integer);
		// Non Generic Version
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(34.78f);
		list.add(true);
		list.add("mkpits");

		for (Object object : list) {
			System.out.println(object);

		}

		// Generic Version

		ArrayList<String> strArr = new ArrayList<String>();
		strArr.add("Ahmedabad");
		strArr.add("Nagpur");
		strArr.add("Mumbai");
		strArr.add("Wardha");
		strArr.add("Amravati");
		strArr.add("Gondia");
//		strArr.add(1); compile time error

		for (String value : strArr) {
			System.out.println(value);
		}
	}

}
