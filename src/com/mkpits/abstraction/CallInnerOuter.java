package com.mkpits.abstraction;

public class CallInnerOuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass outerClass = new OuterClass();

		OuterClass.InnerClass innerClass = outerClass.new InnerClass();

		System.out.println(outerClass.y + innerClass.x);
		System.out.println(innerClass.z);

//		OuterClass.AnotherInnerClass anotherInnerClass = outerClass.new AnotherInnerClass();

		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
		System.out.println(Level.HIGH);
	}

}
