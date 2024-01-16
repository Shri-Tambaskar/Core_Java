package com.mkpits.filehandling;

import java.io.IOException;

public class PrintWriterClass {

	public static void main(String[] args) throws IOException {
//		PrintWriter pw = new PrintWriter(System.out, true);
//		pw.println("Hello friends");
//		pw.close();
//		// pw.flush();
//
//		PrintWriter pw1 = new PrintWriter(new FileWriter("E:\\xyz.txt", true), true);
//		pw1.println("Hello friends");
//		pw1.close();
		// pw.flush();

		int a = 5;

		// lambda expression to define the calculate method
		Square s = (int x) -> x * x;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculate(a);
		System.out.println(ans);

	}

}

interface Square {
	int calculate(int x);
}
