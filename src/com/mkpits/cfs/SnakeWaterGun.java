package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SnakeWaterGun {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char ch = 'y';
		while (ch == 'y' || ch == 'Y') {
			
			String input[] = {"Snake","Water","Gun"};
			
			Random random = new Random();
			int randomInput = random.nextInt(input.length);
			
			String sysInput = input[randomInput];
			
			System.out.println(sysInput);
			
			System.out.println("Enter Your Choice \n1.Snake\n2.Water\n3.Gun");
			String userInput = reader.readLine();
			
			if ((sysInput.equals(userInput) && userInput.equals(sysInput)) ||
					(sysInput.equals(userInput) && userInput.equals(sysInput))) {
				
					System.out.println("Snake Win");
			}
			
			if ((sysInput.equals(userInput) && userInput.equals(sysInput)) ||
					(sysInput.equals(userInput) && userInput.equals(sysInput))) {
				
					System.out.println("Water Win");
			}
			
			if ((sysInput.equals(userInput) && userInput.equals(sysInput)) ||
					(sysInput.equals(userInput) && userInput.equals(sysInput))) {
				
					System.out.println("Gun Win");
			}
			
			System.out.println("Do you wish to Continue Y/N");
			ch = (char) reader.read();
			reader.readLine();
		}
		

	}

}
