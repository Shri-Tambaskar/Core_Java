package com.mkpits.inheritance;

public class Triangle extends Rectangle {

	public void area() {
		float a = (w * h) / 2;
		System.out.println("Width = " + w + " and height = " + h + "\n Area of Triangle = " + a);
	}

}
