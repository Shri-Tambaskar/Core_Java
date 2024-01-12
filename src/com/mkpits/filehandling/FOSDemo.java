package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class FOSDemo {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter data to be written");
		String str = br.readLine();

		str = str + "\n";
		byte b[] = str.getBytes();

		FileOutputStream fos = new FileOutputStream("E:\\xyz.txt", true);

		fos.write(b);
		fos.close();
		System.out.println("Data is written");

	}

}
