package com.mkpits.lambda;

public class Test {

	public static void main(String[] args) {

		MkpitsInterface interface1 = (int x) -> System.out.println(5 * x);
		interface1.square(5);

	}

}
