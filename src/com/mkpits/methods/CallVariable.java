package com.mkpits.methods;

public class CallVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Variables.base_Url);
		Variables variables = new Variables();
		System.out.println(variables.pinCode);
		
		StaticMethods methods = new StaticMethods();
		methods.fetchData();

	}

}
