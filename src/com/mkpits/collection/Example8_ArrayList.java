package com.mkpits.collection;

import java.util.ArrayList;

public class Example8_ArrayList {

	public static void main(String[] args) {

		ArrayList<Student> studentList1 = new ArrayList<Student>();
		studentList1.add(new Student("Shri", 101));
		studentList1.add(new Student("Raj", 102));
		studentList1.add(new Student("Vinay", 103));

		Student student1 = new Student();
		student1.setName("Regved");
		student1.setRoll(106);

		ArrayList<Student> studentList2 = new ArrayList<Student>();
		studentList2.add(new Student("Shri", 101));
		studentList2.add(new Student("Harsh", 104));
		studentList2.add(new Student("Samiksha", 105));

//		for (Student student : studentList1) {
//			System.out.println(student);
//		}
//
//		for (Student student : studentList2) {
//			System.out.println(student);
//		}

		studentList1.addAll(studentList2);
		for (Student student : studentList1) {
			System.out.println(student);
		}
//		System.out.println("--------------------------------------------------------");
//		studentList1.removeAll(studentList2);
//		for (Student student : studentList1) {
//			System.out.println(student);
//		}

		System.out.println("--------------------------------------------------------");
		studentList1.retainAll(studentList2);
		for (Student student : studentList1) {
			System.out.println(student);
		}
	}

}
