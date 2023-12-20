package com.mkpits.arrays;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathDemo demo = new MathDemo();
		demo.mathMethod();
	}

	private void mathMethod() {
		
		System.out.println(Math.cbrt(4));
		System.out.println(Math.addExact(10, 20));
		System.out.println(Math.abs(20.56678));
		System.out.println(Math.ceil(20.56678));
		System.out.println(Math.asin(-1));
		System.out.println(Math.sqrt(79));
		System.out.println(Math.ulp(7.9876544333));
	}

}
