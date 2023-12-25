package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetAllDetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		GetAllDetails allDetails = new GetAllDetails();
		allDetails.inserData();

		GetOtherDetails details = new GetOtherDetails();
		System.out.println(details.getDetails());

	}

	public void inserData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		GetOtherDetails details = new GetOtherDetails();

		System.out.println("Enter First Name");
		String fName = br.readLine();
		if (fName.isEmpty()) {
			System.out.println("First Name Required");
			return;
		} else {
			details.setfName(fName);
		}

//		System.out.println("Enter Last Name");
//		details.setlName(br.readLine());
//
//		System.out.println("Enter Email");
//		details.setEmail(br.readLine());
//
//		System.out.println("Enter Number");
//		details.setMobile(br.readLine());
//
//		System.out.println("Enter Gender");
//		details.setGender(br.readLine());
//
//		System.out.println("Enter Pincode");
//		details.setPinCode(br.readLine());

	}

}
