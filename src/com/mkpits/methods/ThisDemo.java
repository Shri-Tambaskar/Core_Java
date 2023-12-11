package com.mkpits.methods;

public class ThisDemo {

	int pinCode, cityCode, salary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisDemo td = new ThisDemo(440034, 712 , 100000);
		td.getData();
		
		Details details = new Details("Shrikant", 1023, 440034, 712);
		System.out.println(details.getName());
		
		details.setName("MKPits");
		System.out.println(details.getName());
	}
	
	private void getData() {
		// TODO Auto-generated method stub
		System.out.println("Pincodeis :- "+pinCode + " City code is :- "+cityCode+" Salary is :- "+salary);
		
	}

	ThisDemo(int pinCode, int cityCode){
		this.pinCode = pinCode;
		this.cityCode = cityCode;
	}
	
	ThisDemo(int pinCode,int cityCode,int salary){
		this(pinCode,cityCode);
		this.salary = salary;
	}
	
	

}
