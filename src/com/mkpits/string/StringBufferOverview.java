package com.mkpits.string;

public class StringBufferOverview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBufferOverview bufferOverview = new StringBufferOverview();
		bufferOverview.manipulateString();
	}

	public void manipulateString() {

		String myStr = "A thread-safe, mutable sequence of characters";
		StringBuffer details = new StringBuffer(myStr);

		String newStr = "A string buffer is like a String, but can be modified.";

		details = details.append("\t" + newStr);
		System.out.println(details);

		int c = details.capacity();
		System.out.println(c);

		details.trimToSize();
		System.out.println(details);
	}

}
