package com.mkpits.interview;

public final class FinalClass extends FinalExtends {

	static final int accountNumber = 110023;
	final int pin;

	public FinalClass() {

		pin = 321;
	}

	public final void getInterview() {
		System.out.println("Wowwwwwwww");
	}

	public static void main(String[] args) {

//		pin = 90;
//		accountNumber = 110045; Not allowed
//		accountNumber+=12;
		System.out.println(accountNumber + 1);

		String str1 = "Mkpits";
		String str2 = "Mkpits";// == true

		String str3 = new String("Mkpits");
		String str4 = "Mkpits"; // .equals() true

//		final int i;
//		i = 20;
//		int j = i + 20;
//		i = j + 30;
//		System.out.println(i + " " + j);
	}

}
