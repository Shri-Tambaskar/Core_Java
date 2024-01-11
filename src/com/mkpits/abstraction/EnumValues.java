package com.mkpits.abstraction;

public class EnumValues {

	enum Details {
		BASE_URL("https://mkpits.in");

		private String value;

		private Details(String value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {

		for (Details s : Details.values())
			System.out.println(s + " " + s.value);

	}

}
