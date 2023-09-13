/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: (ASSIGNMENT 1)
 * Due: 09/12/23
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Ryan Vanathayan
*/
import java.util.Scanner;
import java.util.Random;

public class ESPGame 
{
	
	public static void main(String[] args) 
	{
		String name, describeUrself, dueDate;
		final String COLOR_RED = "Red", COLOR_GREEN = "Green", COLOR_ORANGE = "Orange", COLOR_YELLOW = "Yellow", COLOR_BLUE = "Blue";
		int score = 0;
		
		java.util.Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.print("Describe yourself: ");
		describeUrself = input.nextLine();
		
		System.out.print("Due Date: ");
		dueDate = input.nextLine();
		
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");

		for(int round = 1; round <= 11; round++) 
		{
			
			Random rdmGen = new Random();
			int range = 5, rdmInt;
			boolean check;
			rdmInt = rdmGen.nextInt(range);
			String usrGuess = "", answer = "";
			
			if(rdmInt == 0)
				answer = COLOR_RED;
			else if(rdmInt == 1)
				answer = COLOR_GREEN;
			else if(rdmInt == 2)
				answer = COLOR_BLUE;
			else if(rdmInt == 3)
				answer = COLOR_ORANGE;
			else if(rdmInt == 4)
				answer = COLOR_YELLOW;
			
			System.out.println("Round " + round + "\n");
			System.out.println("I am thinking of a color.\n" +
							 "Is it Red, Green, Blue, Orange, or Yellow?\n" +
							 "Enter your guess: ");
			usrGuess = input.nextLine();
			
			
				
			while(!usrGuess.equalsIgnoreCase(COLOR_RED) && !usrGuess.equalsIgnoreCase(COLOR_GREEN) &&  !usrGuess.equalsIgnoreCase(COLOR_BLUE) &&
				  !usrGuess.equalsIgnoreCase(COLOR_ORANGE) && !usrGuess.equalsIgnoreCase(COLOR_YELLOW))
			{
				System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?");
				System.out.println("Enter your guess again: ");
				usrGuess = input.nextLine();
	
			}		
														
			
			System.out.print("\n");
				
			if(answer.equalsIgnoreCase(usrGuess))
				score += 1;
			
			System.out.println("I was thinking of " + answer);					
		}	
		
		System.out.println("You guessed "+ score + " out of 11 rounds correctly.");		
		System.out.println("Enter your name: "+ name);		
		System.out.println("Describe yourself: "+ describeUrself);		
		System.out.println("Due Date: "+ dueDate);				
	}

}
