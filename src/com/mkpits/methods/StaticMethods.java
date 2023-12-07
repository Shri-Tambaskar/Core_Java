package com.mkpits.methods;

public class StaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fetchData();
		StaticMethods.fetchData();
		
		StaticMethods methods= new StaticMethods();
		methods.getUser();

	}
	
	public static void fetchData() {
		String firstName = "mkpits";
		System.out.println(firstName);
		char ch = 'z';
		ch++;
		System.out.println(++ch);
		String u = "abc123";
		System.out.println(u.toUpperCase());
	}
	
	private void getUser() {
		String user = "Shrikant";
		System.out.println(user);
	}

}
