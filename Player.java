/* 	Copyright to chetan.badgujar.com
	all right are reserved 
*/
package com.ineuron.assignments.ass1;

import java.util.Scanner;

public class Player {
	 int playerNumber;
	 RangeForGuess range;

	public int getPlayerNumber(RangeForGuess range) {
		
		int start=range.getStart();
		int end= range.getEnd();
		Scanner scanner = new Scanner(System.in);
		System.out.println("hey Player ! Give me Your number  .. ");
		playerNumber = scanner.nextInt();
		while(true)
		{
			if ((playerNumber>=start && playerNumber <=end)) {
				return playerNumber;
			}
			
			System.out.println("hey guesser ! Guess the number only Between "+start+ " and "+end);
			playerNumber=scanner.nextInt();	}
		
		 
		}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
		
		
		
 
}
