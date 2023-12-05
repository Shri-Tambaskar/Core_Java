package com.mkpits.methods;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator operator = new UnaryOperator();
		operator.unaryOperate();

	}

	private void unaryOperate() {
		// TODO Auto-generated method stub
		int pinNumber = 765;
		System.out.println(++pinNumber);//p - 766 , m - 766
		System.out.println(pinNumber++);//p - 766 , m - 767
		System.out.println(pinNumber++);//p - 767 , m - 768
		System.out.println(pinNumber++);//p - 768 , m - 769
		System.out.println(++pinNumber);//p - 770 , m - 770
		System.out.println(pinNumber++);//p - 770 , m - 771
		System.out.println(++pinNumber);//p - 772 , m - 772
		System.out.println(pinNumber);
		
		System.out.println(pinNumber--);
		System.out.println(pinNumber--);
		System.out.println(--pinNumber);
		System.out.println(--pinNumber);
		System.out.println(pinNumber--);
		System.out.println(--pinNumber);
		System.out.println(pinNumber--);
		System.out.println(--pinNumber);
		
		
	}

}
