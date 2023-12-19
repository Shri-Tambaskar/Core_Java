package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.swing.SortOrder;

public class CopyOfArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 String[] coffee = {
		            "Affogato","Americano", "Cappuccino", "Corretto", "Cortado",   
		            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
		            "Marocchino", "Ristretto" };
		 
		 
		 System.out.println(Arrays.toString(coffee));
		 

		 
		int num[] = {1,3,6,1,0,21,9};
		 
		 System.out.println(Arrays.binarySearch(num, 1));
//		 String newCoffee [] = Arrays.copyOf(coffee, 5);
//		 for (String c : newCoffee) {
//			System.out.println(c);
//		}
		 
//		 String newCoffee [] = Arrays.copyOfRange(coffee, 5, 8);
//		 for (String c : newCoffee) {
//			System.out.println(c);
//		} 
		
//		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			
//			System.out.println("Enter 10 Numbers");
//			int number[] = new int[10];
//			
//			for (int i = 0; i < number.length; i++) {
//				System.out.println("Enter "+ (i+1) +" Number");
//				number[i] = Integer.parseInt(br.readLine());
//			}
//			
//			Arrays.sort(number,8,2);
//			
//			for (int num : number) {
//				System.out.println(num);
//			}
			
		 //Arrays.stream(coffee).map(input -> input + " ").forEach(System.out::println);  
	}

}
