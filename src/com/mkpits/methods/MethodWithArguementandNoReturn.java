package com.mkpits.methods;

public class MethodWithArguementandNoReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodWithArguementandNoReturn m = new MethodWithArguementandNoReturn();
		m.getItems(123,45000);

	}

	private void getItems(int itemCode, int price) {
		// TODO Auto-generated method stub
		
		price = price + 4566;
		System.out.println("Item Code :- "+itemCode + " Price :- Rs."+price);
		
	}

}
