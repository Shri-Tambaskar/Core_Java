package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WrapperClass {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Range");
		int range = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter Numbers");
		Integer num[] =new Integer[range];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(reader.readLine());
		}
		
		for (Integer number : num) {
			System.out.println(number);
		}

	}

}
