package com.mkpits.filehandling;

import java.io.File;

public class FileListDemo {

	public static void main(String[] args) {

		File f = new File("E:\\Mkpits_Workspace\\Mkpits_Core_Java");
		String[] str = f.list();

		for (int i = 0; i < str.length; i++) {

			File f2 = new File(f, str[i]);

			if (f2.isDirectory()) {

				System.out.println(f2.getName() + " is Directory");

			} else if (f2.isFile()) {

				System.out.println(f2.getName() + " is File");
			}

		}

	}

}
