package com.mkpits.typecasting;

public class PrimitiveToObjectCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 90, y = 89;
		int output = Integer.compare(x, y);
		System.out.println(output);
		
		String str1 = "10";
		String str2 = "23";
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		String str3 = str1 + str2;
		System.out.println(num1 + num2);

	}

}
