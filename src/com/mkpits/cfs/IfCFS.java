package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class IfCFS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter User Name");
		String userName = br.readLine();
		
		System.out.println("Enter Password");
		String password = br.readLine();
		
		
		if (userName.equals("")) {
			System.out.println("User Name Required");
			
		}
		if (password.equals("")) {
			System.out.println("Password Required");
			
		}
		if (userName.equals("Shrikant") || userName.equals("shrikant") && password.equals("shri@123")) {
			System.out.println("Login Sucessfully......");
		}
	}

}
