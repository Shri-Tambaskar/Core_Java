package com.mkpits.inheritance;

public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj;

		obj = new Rectangle();
		obj.getData(20, 34);
		obj.area();

		obj = new Triangle();
		obj.getData(56, 89);
		obj.area();

	}

}
