package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mkpits.dataconnection.DBConnection;

public class WhileLoop {

	public String name,mobile,age,gender,email;
	public int accountNumber;
	public double balance;
	public float deposit;
	public float withdraw;
	static BufferedReader reader;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WhileLoop loop = new WhileLoop();
		reader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean isConnected = DBConnection.getDBConnection();
		if(isConnected) {
			System.out.println("Database Connected....");	
		}else {
			System.out.println("Connection Failed");
		}
		
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
		System.out.println("Account Balance is :-"+deposit);
		
	}

	private void withdraw() throws NumberFormatException, IOException {
		System.out.println("Enter Deposit Amount");
		withdraw = Float.parseFloat(reader.readLine());
		
		deposit = withdraw - deposit;
		
	}

	private void deposit() throws IOException {
		System.out.println("Enter Deposit Amount");
		deposit = Float.parseFloat(reader.readLine());
		
	}

	private void createAccount() throws Exception {
		
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
		
		DBConnection.insertData();
	}

}
