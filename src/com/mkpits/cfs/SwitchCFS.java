package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SwitchCFS {

	String name,accountType,email;
	long accountNumber;
	static BufferedReader br;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		SwitchCFS obj = new SwitchCFS();
		br = new BufferedReader(new InputStreamReader(System.in));
		
		char ch = 'y';
		while (ch == 'y' || ch == 'Y') {
			
			System.out.println("Enter Your Choice \n1.Create Account\n2.Deposit"
					+ "\n3.Withdraw\n4.Check Balance\n5.Account Details");
			int choice = Integer.parseInt(br.readLine());
			
			switch (choice) {
			case 1:
				obj.creatAccount();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:
				obj.accountDetails();
				break;

			default:
				break;
			}
			System.out.println("Do You Wish to Continue Y|N");
			ch = (char) br.read();
			br.readLine();
					
		}
		

	}

	private void accountDetails() {
		System.out.println("Account Holder Name is "+name+"\nAccount Type "+accountNumber+
				"\nAccount Number "+accountNumber+ "\nEmail "+email);		
	}

	private void creatAccount() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter Account Holder Name");
		name = br.readLine();
		
		System.out.println("Enter Account Type (Saving/Current)");
		accountType = br.readLine();
		
		System.out.println("Enter Account Number");
		accountNumber = Long.parseLong(br.readLine());
		
		System.out.println("Enter Email");
		email = br.readLine();
		
		//Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);    
        //Create instance of matcher   
        Matcher matcher = pattern.matcher(email);  
        if (!matcher.matches()) {
				System.out.println("Email Not Valid");
			}  
	}

}
