package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleDimensional {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		//Declaration of array
//		int []iterate;
//		int rotate[];
//		
//		//construction of array
//		iterate = new int[10];
//		rotate = new int[5];
//		
//		
//		
//		double price[] = new double[4];
//		
//		price[0] = 12.4;
//		price[1] = 34.8;
//		price[2] = 90.78;
//		
//		int l = price.length;
//		System.out.println(l);
//		
//		for (int i = 0; i < price.length; i++) {
//			System.out.println(price[i]);
//		}
//		
//		String name[] = new String[] {"Raj","Vinay","Harsh"};
//		int pinCode[] = {440034,440030,33214,440028};
//		
//		for (int i = 1; i <= pinCode.length; i++) {
//			System.out.println(pinCode[i]);
//		}

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 5 Name");
		String name [] =new String[5];
		
		//Input
		for (int i = 0; i < name.length; i++) {
			name[i] = reader.readLine();
		}
		
		//Output
		for (int i = 0; i < name.length; i++) {
			System.out.println("Name is :- "+name[i]);
		}
	}

}
