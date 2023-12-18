package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SWG {

	String systemInput;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		SWG swg = new SWG();
		swg.developeLogic();
		
		
		
		
//		int player1;
//        int player2;
//        System.out.println("PRESS 1 FOR SNAKE  :  ");
//        System.out.println("PRESS 2 FOR WATER  :  ");
//        System.out.println("PRESS 3 FOR GUN    :  \n");
//        System.out.println("player 1 input : \n ");
//        Scanner sc = new Scanner(System.in);
//        player1 = sc.nextInt();
//        System.out.println("player2 input :  \n");
//        player2 = sc.nextInt();
//        System.out.println("\n");
//// logic 
//          if( player1!=player2){
//              if(player1==3){
//                  if(player2==2) { System.out.println("PLAYER 1 WINS : "); }
//                  else  { System.out.println("player 2 wins  :"); }
//              }
//               if(player1==2){
//                   if(player2==3) { System.out.println("player 1 wins"); }
//                   else { System.out.println("player 2 wins  : "); } }
//                 if (player1==1){
//                       if(player2==2) {
//                           { System.out.println("player1 wins"); }
//                       }
//                       else {System.out.println("player2 wins : ");}
//                   }
//               }
//               else System.out.println("BOTH AREEQUAL TRY AGAIN");
//              
	}

	private void developeLogic() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Welcome to Snake , Water and Gun Game");
		
		char ch = 'y';
		while (ch == 'y' || ch == 'Y') {
		
			int random = (int)Math.ceil(Math.random()*100);
			
			if (random >=1 && random < 33) {
				systemInput = "s";
			}
			
			if (random > 33 && random <= 66) {
				systemInput = "w";
			}
			
			if (random > 66 && random <= 100) {
				systemInput = "g";
			}
			
			System.out.println(systemInput);
			System.out.println("Enter Your Choice \n1.S\n2.W\n3.G");
			String userInput = br.readLine();
			if ((systemInput.equalsIgnoreCase("S") && userInput.equalsIgnoreCase("W")) ||
					(systemInput.equalsIgnoreCase("W") && userInput.equalsIgnoreCase("S"))) {
				
					System.out.println("Snake Win");
			}
			
			if ((systemInput.equalsIgnoreCase("W") && userInput.equalsIgnoreCase("G")) ||
					(systemInput.equalsIgnoreCase("G") && userInput.equalsIgnoreCase("W"))) {
				
					System.out.println("Water Win");
			}
			
			if ((systemInput.equalsIgnoreCase("S") && userInput.equalsIgnoreCase("G")) ||
					(systemInput.equalsIgnoreCase("G") && userInput.equalsIgnoreCase("S"))) {
				
					System.out.println("Gun Win");
			}
			
			System.out.println("Do you wish to Continue Y/N");
			ch = (char) br.read();
			br.readLine();
		}
		
	}

}

