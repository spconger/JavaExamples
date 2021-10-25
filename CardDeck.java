package com.spconger.cardexample1;

import java.util.Scanner;
/*
 * This program provides examples of arrays and loops.
 * It populates an string array with 52 elements
 * representing cards in a standard deck of cards.
 * This would be better done with cards as objects
 * but that is for a later date. 
 * The first array contains the 4 suites of cards. It 
 * shows how to initialize an array with values.
 * The card array is initialized as an empty string array
 * with a limit of 52 values.
 * The card is initialized as a string.
 * The variable c is used as a counter for the cards array
 * index. There is a loop inside of a loop:
 * the outer loop establishes the suite
 * the inner loop populates the 13 cards in that suite
 * the if statements format the strings by type of card
 * When the card string is defined it is added to the card array
 * the ++ iterates the index for the card array.
 * I print out the entire deck with a for each loop--
 * a special loop that iterates through an array or list.
 * A while loop lets the user enter the number of a card.
 * An entry of 0 breaks the loop using the "break" command.
 * Any number outside the bounds of the card array
 * will be marked as invalid.
 */
public class CardDeck {

	public static void main(String[] args) {
		// initialize the scanner
		Scanner scan = new Scanner(System.in);
		//initialize the suites array
		String suites []= {"hearts", "clubs", "diamonds", "spades"};
		//initialize a new String array of 52 elements
		String cards[]=new String [52];
		//initialize the card variable
		String card="";
		//initialize the suite variable;
		String suite="";
		//initialize the c variable 
		int c = 0;
		
		//outer loop for suites
		for (int i = 0; i < 4; i++) {
			suite = suites[i];
			//inner loop for cards in suite
			for (int x = 1; x < 14; x++) {
				if(x == 1) {
					card = "Ace of " + suite;
				}
				else if (x == 11) {
					card = "Jack of " + suite;
				}
				else if (x == 12) {
					card = "Queen of " + suite;
				}
				else if (x == 13) {
					card ="King of " + suite;
				}
				else {
					card = x + " of " + suite;
				}
				//add to cards array	
				cards[c]=card;
				c++; //increment the index of the card array
			}
					
						
		}
			
		// For each loop to display the cards
		
		for (String p : cards) {
			System.out.println(p);
		}
		
		int cardNumber=1;
		//while loop to enter card numbers to view cards
		while (cardNumber != 0) {
			System.out.println( "enter a card number 1 to 52. 0 to quit");
			cardNumber=scan.nextInt();
			if (cardNumber == 0) {
				break; //if 0 break out of while loop
			}
			if (cardNumber < 1 || cardNumber > 52){
				System.out.println("Invalid number");
			}
			else {
				System.out.println(cards[cardNumber-1]);
			}

		}
		System.out.println("good-bye");

	}

}
