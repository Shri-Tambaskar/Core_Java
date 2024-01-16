package com.mkpits.exception;

public class ThrowDemo {

	public static void main(String[] args) {

		ThrowDemo demo = new ThrowDemo();
		demo.square(-1);
		demo.square(10);
	}

	private void square(int n) {

		try {
			if (n < 0) {
				throw new UserException();
			} else {
				int r = n * n;
				System.out.println("Square of " + n + " = " + r);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
