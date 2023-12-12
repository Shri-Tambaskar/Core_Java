package com.mkpits.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Registration {

	String fName,lName,email,password;
	String gender;
	long mobile;
	int age;
	public static void main(String[] args) throws Exception {
		

		Registration registration = new Registration();
		registration.register();
	}
	
	public void register() throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter First Name");
		this.fName = reader.readLine();
		
		System.out.println("Enter Last Name");
		this.lName = reader.readLine();
		
		System.out.println("Enter Email");
		this.email = reader.readLine();
		
		System.out.println("Enter Gender");
		this.gender = reader.readLine();
		
		System.out.println("Enter Mobile");
		this.mobile = Long.parseLong(reader.readLine());
		
		System.out.println("Enter Age");
		this.age = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter Password");
		this.password = reader.readLine();
		
	}

}
