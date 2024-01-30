package com.mkpits.collection;

import java.util.HashMap;

public class Example16_HashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> list = new HashMap<Integer, String>();
		list.put(23, "Regved");
		list.put(0, "Raj");
		list.put(3, "Raj");

		list.put(3, "Vinay");

//		System.out.println(list);
//
//		for (Map.Entry<Integer, String> e : list.entrySet()) {
//			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
//		}
//
//		var keySet = list.keySet();
//		for (var key : keySet) {
//			System.out.println(key);
//		}
//
//		var value = list.values();
//		for (var v : value) {
//			System.out.println(v);

		list.values().forEach(s -> System.out.println(s));
		list.keySet().forEach(s -> System.out.println(s));

		list.keySet().stream().reduce(Integer::max).ifPresent(System.out::println);
	}

}
