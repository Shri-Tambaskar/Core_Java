package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveCharacter character = new RemoveCharacter();
		character.removeCharacter();
	}

	private void removeCharacter() {
		
		String name = "Shrikant Tambaskar Yavatmal";
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int range = name.length();
		char ch[] = new char[range];
		
		int counter =0;
		for (int i = 0; i < ch.length; i++) {
			
			for (int j = i+1; j < ch.length; j++) {
				
				if (name.charAt(i) == name.charAt(j)) {
					
					break;
				}
				
				if (j == i)    
	            {   
	                ch[counter++] = ch[i];   
	            }   
			}
		}
		
		 System.out.println(String.valueOf(Arrays.copyOf(ch, counter)));
	}

}
