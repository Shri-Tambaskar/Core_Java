package com.mkpits.methods;

public class MethodReturnAndArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodReturnAndArgs m = new MethodReturnAndArgs();
		String uValue = m.getDetails(1,10000);
		System.out.println(uValue);

	}

	private String getDetails(int id, int salary) {
		// TODO Auto-generated method stub
		double incentive = salary + (salary*0.1);
		String details = "Id is :-" + id + " , Salary With Incentive :- " + incentive;
		return details;
	}

}
