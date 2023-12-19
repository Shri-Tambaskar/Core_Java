package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForEachArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ForEachArray array = new ForEachArray();
		array.getData();

	}

	private void getData() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 5 Names");
		String name[] = new String[5];
		
		for (int i = 0; i < name.length; i++) {
			name[i] = br.readLine();
		}
		
		for (String n : name) {
			System.out.println(n);
		}
		
		
	}

}
