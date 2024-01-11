package com.mkpits.abstraction;

public class CallingUrl {

	public static void main(String[] args) {

		for (Url url : Url.values()) {

			System.out.println(url.baseUrl);
		}

	}

}
