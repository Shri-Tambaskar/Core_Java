package com.mkpits.methods;

public abstract class Calling {
	
	public String name = "Shri";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uName = "shri";
		MethodWithNoArguement m = new MethodWithNoArguement();
		m.getUserName(uName);
		m.getMobile(9876543210l);
		System.out.println("Hello Priti");
		System.out.println("Hello Chetan and Shivani");

	}
	
	

}
