package com.mkpits.userinput;

public class RegisterUser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Registration registration = new Registration();
		registration.register();
		
		System.out.println("First Name is :- "+registration.fName);
		System.out.println("Last Name is :- "+registration.lName);
		System.out.println("Email Name is :- "+registration.email);
		System.out.println("Gender Name is :- "+registration.gender);
		System.out.println("Mobile Name is :- "+registration.mobile);
		System.out.println("Password Name is :- "+registration.password);
	}

}
