package com.mkpits.inheritance;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		t1.getInfo(1, "abc");
		t1.display();

//		int z = t1.getMark(75, 70);
//		int z1 = t2.getMark(66, 65);
//		int sum = z + z1;

//		int s = (t1.getMark(23, 45) + t2.getMark(67, 45));
		System.out.println("\nTotal Marks = " + (t1.getMark(23, 45) + t2.getMark(67, 45)));
//		int avg = s / 4;
		System.out.println("\nAverage is = " + (t1.getMark(23, 45) + t2.getMark(67, 45)) / 4);

	}

}
