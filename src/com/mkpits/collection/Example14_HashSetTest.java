package com.mkpits.collection;

import java.util.HashSet;

public class Example14_HashSetTest {

	public static void main(String[] args) {

		HashSet<Student> studentSet = new HashSet<Student>();
		studentSet.add(new Student("s1", 101));
		studentSet.add(new Student("s3", 103));
		studentSet.add(new Student("s2", 102));
		studentSet.add(new Student("s5", 102));
		studentSet.add(new Student("s2", 102));
		studentSet.add(new Student("s4", 104));

//		studentSet.forEach(System.out::println);

		HashSet<Student> studentSet2 = new HashSet<Student>();

		studentSet2.add(new Student("s6", 105));
		studentSet2.add(new Student("s7", 106));
		studentSet2.add(new Student("s8", 107));
		studentSet2.add(new Student("s9", 108));

		studentSet.addAll(studentSet2);
//		studentSet.forEach(System.out::println);

//		studentSet.retainAll(studentSet2);
//		studentSet.forEach(System.out::println);

		System.out.println(studentSet.contains(new Student("s9", 108)));

		System.out.println(studentSet.containsAll(studentSet2));

	}

}
