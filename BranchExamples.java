package com.spconger.branching;

import java.util.Scanner;
/*
 * This class actually contains several distinct programs
 * each an example of branching statements.
 * First is a simple if/else that tests whether
 * a customer is old enough to buy alcohol based
 * on their birth year. The second example 
 * uses a if/else if/else bloc to assign
 * a donor to different levels of patronage depending
 * on the amount of their donation.
 * Third is a password example comparing strings
 * and lastly a switch example.
 */

public class BranchExamples {

	public static void main(String[] args) {
		//initialize scanner
		Scanner scan = new Scanner(System.in);
		//declare year as constant
		final int CURRENT_YEAR=2021;
		
		//check age limit
		System.out.println("Enter your year of birth ");
		int year = scan.nextInt();
		//calculate age
		int age = CURRENT_YEAR - year;
		
		//check to see if age greater than or equal to 21
		if (age >= 21) {
			System.out.println("Valid license for alcohol");
		}
		else {
			System.out.println("Invalid License.");
		}
		
		//donor example
		
		System.out.println("********************");
		System.out.println("Donor Example");
		System.out.println("********************");
		//get donation
		System.out.println("Enter your donation amount. ");
		int donation =  scan.nextInt();
		//set an initial level for donors
		String level = "member";
		
		//for any donation above a thousand
		//if you are less than a thousand you will be just
		//a member. Note the sequence--when the program
		//finds a true statement it will break out
		//of the if block and not evaluate the others
		if (donation > 1000) {
			if (donation <= 2000) {
				level = "prime member";
			}
			else if (donation <= 5000) {
				level = "Gold level member";
			}
			else if(donation <= 10000) {
				level = "platnum member";
			}
			else {
				level = "Patron";
			}
		}
		System.out.println("You are a " + level);
		
		//password example
		System.out.println("*************************");
		System.out.println("Password Example");
		System.out.println("*************************");
		//Hard code user name and password
		String username = "User";
		String password = "passwd1";
		scan.nextLine(); //picks up stray invisible characters from previous scanner use
		System.out.println("Enter your username ");
		String user = scan.nextLine();
		System.out.println("Enter your Password ");
		String pass = scan.nextLine();
		
		//with strings must use equals rather than ==
		
		if (user.equals(username) && pass.equals(password)){
			System.out.println("Welcome " + username);	
		}
		else {
			System.out.println("Invalid username or password");
		}
		
		// Switch example
		
		System.out.println("**********************");
		System.out.println("Switch Example");
		System.out.println("**********************");
		System.out.println("Enter a number betwee 1 and 7 ");
		int day = scan.nextInt();
		String dayString="";
		
		//couched in an if statement that only considers
		//valid numbers
		if (day >= 1 && day <= 7) {
			switch (day) {
			case 1: dayString = "Sunday";
			break;
			case 2: dayString = "Monday";
			break;
			case 3: dayString = "Tuesday";
			break;
			case 4: dayString = "Wednesday";
			break;
			case 5: dayString = "Thursday";
			break;
			case 6: dayString = "Friday";
			break;
			case 7: dayString = "Saturday";
			break;
			default: dayString = "invalid";
			break;
			}
		}
		else {
			dayString = "Invalid day number";
		}
		System.out.println(dayString);
		}
	}


