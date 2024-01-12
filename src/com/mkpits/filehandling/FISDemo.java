package com.mkpits.filehandling;

import java.io.FileInputStream;

public class FISDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("E:\\xyz.txt");
		int b = 0;
		while ((b = fis.read()) != -1) // read byte one by one
		{
			System.out.print((char) b); // remove char and sec o/p
		}
		fis.close();

	}

}
