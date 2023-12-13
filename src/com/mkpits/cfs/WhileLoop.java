package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileLoop {

	String name,mobile,age,gender,email;
	int accountNumber;
	double balance;
	static BufferedReader reader;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WhileLoop loop = new WhileLoop();
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		char ch = 'y';
		
		while (ch == 'y' || ch == 'Y') {
			
			System.out.println("Enter Your Choice \n1.Create Account\n2.Deposit"
					+ "\n3.Withdraw\n4.Check Balance\n5.Account Details");
			int choice = Integer.parseInt(reader.readLine());
			
			switch(choice) {
			case 1:
				loop.createAccount();
				break;
			case 2:
				loop.deposit();
				break;
			case 3:
				loop.withdraw();
				break;
			case 4:
				System.out.println("Your Balance is :-"+loop.balance);
				break;
			case 5:
				loop.accountDetails();
				break;
			default:
					System.out.println("Invalid Choice");
					break;
			}
			
			System.out.println("Do you wish to continue Y/N");
			ch = (char) reader.read();
			reader.readLine();
		}

	}
	
	private void accountDetails() {
		
		System.out.println("Account Holder Name :-"+name);
		System.out.println("Account Number :-"+accountNumber);
		System.out.println("Account Holder Email :-"+email);
		System.out.println("Account Holder Mobile :-"+mobile);
		System.out.println("Account Holder Age :-"+age);
		System.out.println("Account Holder Gender :-"+gender);
		
	}

	private void withdraw() {
		
		
	}

	private void deposit() {
		System.out.println("");
		
	}

	private void createAccount() throws IOException {
		System.out.println("Enter Account Holder Name");
		name = reader.readLine();	
		
		System.out.println("Enter Mobile");
		mobile = reader.readLine();	
		
		System.out.println("Enter Email");
		email = reader.readLine();	
		
		System.out.println("Enter Gender");
		gender = reader.readLine();	
		
		System.out.println("Enter Age");
		age = reader.readLine();	
		
		accountNumber = (int)Math.floor(Math.random()*1000000);
		System.out.println("Account Created "+accountNumber);
	}

}
