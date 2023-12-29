package com.mkpits.interfaces;

public class AbstractClassCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s1 = new Circle("Blue", 4.4);
		Shape s2 = new Rectangle("Green", 3.1, 2.1);

		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
