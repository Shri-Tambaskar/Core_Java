package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

public class ForLoop {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//		
//		 int i,fact=1;  
//		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		 
//		 System.out.println("Enter Number");
//		 int number=Integer.parseInt(br.readLine());//It is the number to calculate factorial  
//		  
//		 for(i=1;i<=number;i++){  
//			 
//		      fact=fact*i;    
//		 }    
//		  System.out.println("Factorial of "+number+" is: "+fact);    
//
//		  System.out.println("ENter Number 1");
//		  int a = Integer.parseInt(br.readLine());
//		  
//		  System.out.println("ENter Number 2");
//		  int b = Integer.parseInt(br.readLine());
//		  
//		  System.out.println((a>b)?"a is greater":"b is greater");
//		  String value = (a>b)?"a is greater":"b is greater";
		
		int sum = 0;
	    int n = 100;

	    // for loop
	    for (int i = 1; i <= n; i++) {
	      // body inside for loop
	      sum += i;     // sum = sum + i
	    }
	       
	    System.out.println("Sum = " + sum);
	    
	    
	    for (int i = 0; i <= 5; i++) {
	    	
			for (int j = 1; j <= 5 ; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	    
//	    int weeks = 3;
//	    int days = 7;
//
//	    // outer loop prints weeks
//	    for (int i = 1; i <= weeks; ++i) {
//	      System.out.println("Week: " + i);
//
//	      // inner loop prints days
//	      for (int j = 1; j <= days; ++j) {
//	        System.out.println("  Day: " + j);
//	      }
//	    }
//		  
	    
//	    int weeks = 3;
//	    int days = 7;
//	    int i = 1;
//	    
//	    
//
//	    // outer loop
//	    while (i <= weeks) {
//	      System.out.println("Week: " + i);
//
//	      // inner loop
//	      for (int j = 1; j <= days; ++j) {
//	        System.out.println("  Days: " + j);
//	      }
//	      ++i;
//	    }
	    
//	    int rows = 5;
//
//	    // outer loop
//	    for (int i = rows; i <= rows; --i) {
//
//	      // inner loop to print the numbers
//	      for (int j = 1; j <= i; ++j) {
//	        System.out.print(j + " ");
//	      }
//	      System.out.println("");
//	    }
	    
	    for(int i=0;i<3;i++)
	    {
	    	for(int j=3;j<6;j++)
	    	{
	    		if(j<4)
	    		{
	    			//break;
	    			continue;
	    		}
	    		else
	    		{
	    			System.out.println("i = "+i+" j ="+j);
	    		}
	    	}
	    }

		  
	}

}
