/* 	Copyright to chetan.badgujar.com
	all right are reserved 
*/
package com.ineuron.assignments.ass1;

import java.util.Scanner;

public class Guesser {

	int guessedNumber ;
	
	public int  getGuessedNumber(RangeForGuess range) {
		int start=range.getStart();
		int end= range.getEnd();
		
	Scanner scanner= new Scanner(System.in);
	 
 	
	System.out.println("hey guesser ! Guess the number only Between "+start+ " and "+end);
	guessedNumber=scanner.nextInt();
    
	while(true)
	{
		if ((guessedNumber>=start && guessedNumber <=end)) {
			return guessedNumber;
		}
		
		System.out.println("hey guesser ! Guess the number only Between "+start+ " and "+end);
		guessedNumber=scanner.nextInt();	}
	
	 
	}
}
