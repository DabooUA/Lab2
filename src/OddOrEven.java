/**
 * @author Serhiy Bardysh
 *Creating a program that prompts user to enter a number between 1 and 100
 *and return his input with addressing that user with name provided and
 *number input.
 */

import java.util.Scanner;

public class OddOrEven {

		public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		
		int userNum = 0;
		String choice = "y";
		String userName ;
		
		System.out.println("Welcome to Grand Circus Odd or Even number Identefier!!!");
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.println();	
		System.out.println("Please enter your name: ");
		userName = scnr.nextLine();
		
		System.out.println("Please enter number between 1 and 100: ");
		userNum = scnr.nextInt();
	
		if (userNum < 1 || userNum > 100) {
			System.out.println("You have entered invalid number. Please enter number between 1 and 100: ");
			userNum = scnr.nextInt();
			}
		
		if (userNum % 2 == 0) {
			System.out.println(userName + " number you entered is even: " + userNum );
			}
		else {
			System.out.println(userName + " number you entered is odd: " + userNum);
			}
		System.out.println();
		System.out.println("Would you like to enter another number? y/n: ");
		choice = scnr.next();
			}
	 
		System.out.println("The end.");
		scnr.close();
		}
			
}


