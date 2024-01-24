package com.mkpits.lambda;

public interface MkpitsInterface {

	void square(int x);

	default void display() {
		System.out.println("Hello");
	}
}
