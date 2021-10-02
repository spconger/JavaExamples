package com.spconger.stringexamples;


import java.util.Scanner;
/*
 * This program extracts a user name from an email.
 * It uses the indexOf function to find the position
 * of the @ sign and returns all the characters before
 * the @ sign. Remember a string is an array of characters.
 * The first position is always 0. If the indexOf function 
 * does not return a number, because there is no @ sign,
 * the program returns "invalid email address."
  */

public class StringExample {
	
		public static void main(String[] args) {
		//initialize the scanner
			Scanner scan = new Scanner(System.in);
			//prompt for the user to enter an email address
			System.out.println("enter an email address");
			//assign the result to the string email
			String email=scan.nextLine();
			//this is just to prove that a string is a list
			//or array of characters. 5 will be the 6th character
			//because the first is 0
		    char letter = email.charAt(5);
		    System.out.println(letter);
		//find the @ sign using indexOf(). The variable
		    //atSign is given an initial value of -1
		   int atSign = -1;
		   atSign=email.indexOf('@');
		   //check it see if the indexOf found a value for the @
		   //if not print invalid, but otherwise
		   //extract the user name using the substring function.
		   //we start at 0, and end at the index number
		   //returned for the @ sign
		   if (atSign==-1) {
			   System.out.println("Invalid email address");
		   }
		   else {
		       System.out.println(atSign);
		       String username=email.substring(0,atSign);
		       System.out.println(username);
		   }
		   //it is always a good idea to close the scanner
		scan.close();

	}

}
