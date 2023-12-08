package com.mkpits.constructor;

public class ParameterisedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterisedConstructor p = new ParameterisedConstructor(56);
		System.out.println(p);
		ParameterisedConstructor p1 = new ParameterisedConstructor(12, 450000, 9890581851l);

	}
	public ParameterisedConstructor() {
		
	}
	
	public ParameterisedConstructor(int a) {
		System.out.println(a);
	}
	
	public ParameterisedConstructor(int a,float b) {
		System.out.println(a);
	}
	
	public ParameterisedConstructor(float a ,int b) {
		System.out.println(a);
	}
	
	public ParameterisedConstructor(int a,String name,char ch) {
		System.out.println(a);
	}
	
	public ParameterisedConstructor(int a, double salary,long mobile) {
		System.out.println(a +" "+salary+" "+mobile);
	}

}
