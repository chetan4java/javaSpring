/* 	Copyright to chetan.badgujar.com
	all right are reserved 
*/
package com.ineuron.assignments.ass1;

import java.util.Scanner;

public class Umpire {
	
	  int numFromGuesser;
		RangeForGuess range ;

	  
	  int numFromPlayer1;
	  int numFromPlayer2;
	  int numFromPlayer3;
 	  
	
 	public void setGuessingRange() {
 		range = new RangeForGuess();
 		Scanner scanner= new Scanner(System.in);
 		 	
 		System.out.println("Number Guessing Range Start From ");
 		range.setStart(scanner.nextInt());
 		System.out.println("Number Guessing Range End at  ");
 		range.setEnd(scanner.nextInt());
 		System.out.println(range.getStart() +" "+ range.getEnd()); 
 				}
	

	public  void collectGuessedNumber() {
 	
		Guesser guesser = new Guesser();
		numFromGuesser=guesser.getGuessedNumber(range);
 
		
	}
	public void collectPlayersNumber()
	{
//		Scanner scanner = new Scanner(System.in);
//		
//		for (int i=0;i<5;i++)
//		{
//			Player player= new Player();
//			player.range.start=range.start;
//			player.range.end=range.end;
//			
//			player.setPlayerNumber(scanner.nextInt());
//
//			
//		}
		Player player= new Player();

		
		numFromPlayer1=player.getPlayerNumber(range);
		numFromPlayer2=player.getPlayerNumber(range);
		numFromPlayer3=player.getPlayerNumber(range);
	}
	
	
	void compare()
	{
		
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 and Player2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and Player3 won ");
			}
			else
			{
			
			System.out.println("Player 1 won the game");
			}
		}
		
		
		else if(numFromGuesser==numFromPlayer2)
		{
			
			if(numFromGuesser==numFromPlayer3)
			{
			System.out.println("Player 2 and Player3 won the game");
			}
			else
			{
				System.out.println("Player 2 won the game");
			}
		}
		
		
		
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost! try again");
		}
	}
	
}
