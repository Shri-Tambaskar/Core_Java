package com.mkpits.abstraction;

public class OuterClass {

	int y = 10;

	class InnerClass {
		int x = 90;

		int z = x + y;
	}

	private class AnotherInnerClass {
		int a = 67;

		public void getData() {
			System.out.println("Value is " + a);
		}
	}

}
