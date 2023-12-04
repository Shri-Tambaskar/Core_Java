package com.mkpits.methods;

public class MethodWithNoArguement {

	public static void main(String[] args) {
		
		String userName = "mkpits";
		String password = "shri@1234";
		long mobile = 9890581851l;
		
		MethodWithNoArguement m = new MethodWithNoArguement();
		
		//calling method
		m.getUserName(userName);
		m.getMobile(mobile);

	}

	public void getMobile(long mobile) {
		// TODO Auto-generated method stub
		System.out.println(mobile);
		
	}

	//called method
	public void getUserName(String userName) {
		// TODO Auto-generated method stub
		System.out.println(userName);
		
	}

}
