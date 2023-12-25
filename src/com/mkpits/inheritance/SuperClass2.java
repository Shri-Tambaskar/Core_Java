package com.mkpits.inheritance;

public class SuperClass2 extends SuperClass1 {

	int x = 180;

	public void addData() {
		int z = x + super.x;
		System.out.println("Add :- " + z);
	}

	public SuperClass2() {
		super();
		System.out.println("This is default constructor of sub class x = " + x);
	}

	SuperClass2(int x) {

		super(x);
		this.x = x;
		System.out.println("This is parameterised constructor of sub class x = " + x);
	}
}
