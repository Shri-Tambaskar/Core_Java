package com.mkpits.interfaces;

public class Test2 implements Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 t = new Test2();
		t.getData();
		Test1.fetchData();
	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("Hello From Interface");

	}

	@Override
	public void addData() {
		// TODO Auto-generated method stub

	}

}
