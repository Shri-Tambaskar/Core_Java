package com.mkpits.arrays;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Shrikant Tambaskar";
		
		char ch[] = new char[name.length()];
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = name.charAt(i);
		}
		
		for (char c : ch) {
			System.out.print(c);
		}
		
		System.out.println("\nReverse Order");
		for (int i = ch.length-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

	}

}
