package com.mkpits.constructor;

public class CallingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorObject object2 = new ConstructorObject();
		
		ConstructorObject object1 = new ConstructorObject(object2);
		System.out.println(object1.pinCode);
		System.out.println(object1.id);
	}

}
