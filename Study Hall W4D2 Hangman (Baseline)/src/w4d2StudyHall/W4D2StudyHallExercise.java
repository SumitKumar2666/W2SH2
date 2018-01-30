package w4d2StudyHall;

import java.util.Scanner;


public class W4D2StudyHallExercise {

	private static String usersName;
	private static String inputFromUser;
	private static char menuCharacter;

	public static void main(String args[]) {
		 
		/* Initialize the Text Hangman game */
		Scanner keyboard = new Scanner(System.in);

		/* Welcome the user and request the user to enter a name */
		System.out.println("Welcome!");
		System.out.println("Please enter your name followed by a return.");
		
		/* Read in the user's name */
		String userName= keyboard.next();
		

		while (true) {
			/* Display menu */
			System.out.println(userName + ", please enter a command letter followed by a return!");
			System.out.println("p -> Play The Game");
	        System.out.println("s -> View Statistics");
	        System.out.println("q -> Quit");
	        
			/* Read the menu character */
	        inputFromUser=keyboard.next();

			/* Play the game? */
	        if(inputFromUser.equals("p")) {
	        	System.out.println("Play the game command recognised");
	        }

			/* View the statistics? */
	        else if(inputFromUser.equals("s")) {
	        	System.out.println("View the statistics command recognised");
	        }

			/* Quit the game? */
	        else if(inputFromUser.equals("q")) {
	        	System.out.println("Quit the game command recognised");
	        	System.out.println("Thank You For Playing, " + userName + "!");
	        	return;
	        }
	        
			/* Display error (if command is none of the above) */
	        else {
	        	System.out.println("***Error***");
	        	System.out.println("Invalid item entered. It must be p,q or s");
	        	System.out.println("The input found was:"+inputFromUser);
	        }
		}
	}
}