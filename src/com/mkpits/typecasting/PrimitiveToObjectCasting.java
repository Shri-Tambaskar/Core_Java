package com.mkpits.typecasting;

public class PrimitiveToObjectCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimitiveToObjectCasting p = new PrimitiveToObjectCasting();
		System.out.println(p);
		
		int pinCode = 440010;
		
		Integer cast = 7854;
		System.out.println(cast.getClass());
		
		Integer i = new Integer(pinCode);
		System.out.println(i);
		String pi = Integer.toString(pinCode);
		System.out.println(pi);
		
		char name = 'S';
		Character uName = new Character(name);
		System.out.println(uName);

	}

}
