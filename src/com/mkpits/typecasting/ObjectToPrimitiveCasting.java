package com.mkpits.typecasting;

public class ObjectToPrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 90, y = 89;
		int output = Integer.compare(x, y);
		System.out.println(output);
		
		String str1 = "10";
		String str2 = "23";
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		String input1 = "23.456";
		String input2 = "56.21";
		
		float f1 = Float.parseFloat(input1);
		float f2 = Float.parseFloat(input2);
		
		System.out.println(f1 + f2);

	}

}
