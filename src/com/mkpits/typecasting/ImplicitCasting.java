package com.mkpits.typecasting;

public class ImplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b = 20;
		long c = a + b;	
		//See error //short c=a+b;//there will be error.
		System.out.println("Addition of "+a+" and "+b+" = " +c);
		
		byte p = 12;  
	      System.out.println("byte value : "+p);  
	      // Implicit Typecasting  
	      short q = p;  
	      System.out.println("short value : "+q);  
	      int r = q;  
	      System.out.println("int value : "+r);  
	      long s = r;  
	      System.out.println("long value : "+s);  
	      float t = s;  
	      System.out.println("float value : "+t);  
	      double u = t;  
	      System.out.println("double value : "+u);  


	}

}
