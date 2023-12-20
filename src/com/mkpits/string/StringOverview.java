package com.mkpits.string;

public class StringOverview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOverview overview = new StringOverview();
		overview.getOverView();

	}

	private void getOverView() {
		// TODO Auto-generated method stub

		String fName = "SHRIKANT TAMABASKAR";
		String lName = "Shrikant";

		System.out.println(String.join("#", fName, lName));
//		String newName = String.join(":", fName, lName);
//		System.out.println(newName);
//		System.out.println(fName.charAt(6));
//		System.out.println(lName.chars());
//
//		System.out.println(fName.compareTo(lName));

//		System.out.println(fName.compareToIgnoreCase(lName));
//
//		System.out.println(fName.concat(lName));
//		System.out.println(fName.contains(lName));
//		System.out.println(fName.contentEquals(lName));
//		byte[] b = { 65, 66, 67, 68, 69, 50 };
//		char ch[] = { 'x', 'y', 'z', '1', '2' };
//
//		String s1 = new String();
//		System.out.println("S1 =" + s1);// nothing
//
//		String s2 = new String(b);
//		System.out.println("S2 = " + s2);// ABCDE2
//
//		String s3 = new String(b, 0, 3);//
//		System.out.println("S3 = " + s3);// ABC
//
//		String s4 = new String(ch);
//		System.out.println("S4 = " + s4);// xyz12
//
//		String s5 = new String(ch, 2, 2);// x1
//		System.out.println("S5 = " + s5);
//
//		String s6 = new String(s2);
//		System.out.println("S6 = " + s6);// ABCDE2

		char ch[] = { 's', 'h', 'r', 'i' };
		System.out.println(String.copyValueOf(ch));

		System.out.println(fName.endsWith("a"));
		System.out.println(lName.startsWith("S"));

		System.out.println(lName.equals(fName));
		System.out.println(fName.equalsIgnoreCase(lName));
		System.out.println(fName.getBytes());

		System.out.println(lName.indexOf("r"));

		System.out.println(fName.intern());

		System.out.println(fName.replace('R', 'c'));

		System.out.println(fName.toLowerCase());
		System.out.println(lName.toUpperCase());

		System.out.println(fName.replaceAll(fName, "MKPITS"));
		System.out.println(fName);

		System.out.println(fName.codePointAt(4));

		String fs;
		float floatVar = 23.56f;
		int intVar = 45;
		String stringVar = "Shrikant";
		fs = String.format("The value of the float variable is %f, while the value of the "
				+ "integer variable is %d, and the string is %s", floatVar, intVar, stringVar);
		System.out.println(fs);
	}

}
