package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCFS {

	static BufferedReader br;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		SwitchCFS obj = new SwitchCFS();
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Choice \n1.Create Account\n2.Deposit\n3.Withdraw\n4.Check Balance");
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

		default:
			break;
		}

	}

	private void creatAccount() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter Account Holder Name");
		String holder = br.readLine();
	}

}
