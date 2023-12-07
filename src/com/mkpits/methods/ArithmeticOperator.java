package com.mkpits.methods;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOperator operator = new ArithmeticOperator();
		operator.add(23,45.89);
		operator.sub(23,45);
		operator.mult(23,45);
		operator.div(23,45);

	}

	private void div(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("Division is -"+(i/j));
		
	}

	private void mult(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("Multiplication -"+(i*j));
	}

	private void sub(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("Subtraction -"+(i-j));
	}

	private void add(int i, double d) {
		// TODO Auto-generated method stub
		System.out.println("Addition -"+(i+d));
	}

}
