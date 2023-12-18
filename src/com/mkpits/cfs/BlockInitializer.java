package com.mkpits.cfs;

public class BlockInitializer {

	 int speed;  
     
	 BlockInitializer(){
		 
		 System.out.println("speed is "+speed);
		 }  
	   
	    {
	    	speed=100;
	    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlockInitializer b1 = new BlockInitializer();
		BlockInitializer b2 = new BlockInitializer();
	}

}
