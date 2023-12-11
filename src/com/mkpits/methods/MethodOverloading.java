package com.mkpits.methods;

public class MethodOverloading {
	int x=10,y=20,z;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m1=new MethodOverloading();
		m1.add();	
		m1.display();
		m1.add(40,50);
		m1.display();


	}
	
	
	void add()
	{
		z  = x + y;
	}
	void add(int x1,int y1)
	{
		x = x1;
		y = y1;
		z = x + y;
	}
	void display()
	{
		System.out.println("Addition of " +x +" and " +y+" = "+z);
	}


}
