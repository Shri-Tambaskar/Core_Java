package com.mkpits.inheritance;

public class Rectangle {

	int w, h;

	public void getData(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public void area() {
		int a = w * h;
		System.out.println("Width = " + w + " and height = " + h + "\n Area of Rectangle = " + a);

	}
}
