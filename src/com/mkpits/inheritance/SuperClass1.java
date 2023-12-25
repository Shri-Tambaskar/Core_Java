package com.mkpits.inheritance;

public class SuperClass1 {

	int x = 90;

	public SuperClass1() {

		System.out.println("This is default constructor of super class x = " + x);
	}

	SuperClass1(int x) {

		this.x = x;
		System.out.println("This is parameterised constructor of super class x = " + x);
	}
}
