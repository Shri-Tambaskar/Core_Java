package com.mkpits.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

	static BufferedReader bufferedReader;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Price");
		float price = scanner.nextFloat();
		System.out.println(price);
		
		System.out.println("Enter Price");
		float price1 = scanner.nextFloat();
		System.out.println(price1);
		
		
		InputStreamReader input = new InputStreamReader(System.in);
		bufferedReader = new BufferedReader(input);
		
		UserInput userInput = new UserInput();
		userInput.getFirstName();
		userInput.getAge();

	}
	
	public void getFirstName() throws Exception {
		System.out.println("Enter Your Name");
		String name = bufferedReader.readLine();
		System.out.println("Customer Name :- "+name);
	}
	public void getAge() throws Exception {
		System.out.println("Enter Your Age");
		int age = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Customer Age :- "+age);
	}

}
