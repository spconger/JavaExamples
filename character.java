package com.spocnger.characterExample;

/*
 * This class just illustrates that a string is a 
 * list of characters. It declares a string
 * and then pulls the 7th character from that string
 * which is the letter a.
 */

public class character {

	public static void main(String[] args) {
		// declare a string
		String text = "This is a string";
		//print out the string
		System.out.println(text);
		//declare a character and assign it the value
		//of the ninth character in the string text
		//8 because counting starts at 0
		char c=text.charAt(8);
		//print out the character
		System.out.println(c);
		

	}

}
