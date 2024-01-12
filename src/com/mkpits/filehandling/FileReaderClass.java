package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderClass {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("E:\\login.txt");
		BufferedReader br = new BufferedReader(fr);
		String data = "";
		while ((data = br.readLine()) != null) {
			System.out.print(data);
		}
		fr.close();

	}

}
