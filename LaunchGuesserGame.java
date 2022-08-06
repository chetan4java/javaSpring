/* 	Copyright to chetan.badgujar.com
	all right are reserved 
*/
package com.ineuron.assignments.ass1;

import java.util.Scanner;

/**
 * 
 * @author javaee
 *
 */



public class LaunchGuesserGame {
public static void main(String[] args) {
	

	Scanner scanner = new Scanner(System.in);
	boolean go = true;
	while (go) {
		System.out.println("1 Level 1 (with guess no belongs to given range)");
		System.out.println("2 level 2 (multiple players) ");
		System.out.println("0 Exit");
		System.out.println("Enter Your Choice ");
		int input = scanner.nextInt();
		switch (input) {
		case 1:
			Umpire umpire =new Umpire();
		 	
			umpire.setGuessingRange();

			umpire.collectGuessedNumber();
			umpire.collectPlayersNumber();
			umpire.compare();
			break;
		case 2:

			System.out.println("Level 2 of Guesser game start ");
			break;
		case 0:
			go = false;
			break;
			
		}

		}
	System.out.println("Good BYE !!");

}
}

 
