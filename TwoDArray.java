package com.spconger.twodarray;

import java.util.Scanner;
/*
 * This class shows how to do a simple 2 dimensional
 * array. The array has 5 elements in the first dimension
 * and 2 in the second. In the second dimension
 * 0 is used for title, and 1 for author
 * There is nothing that forces you to be consistent
 * with this--it is entirely up to the programmer.
 * Also, there are more sophisticated ways to to do 
 * this. Arrays are fairly primitive structures.
 * Modern languages have better objects for dealing
 * with multivalued lists.
 */

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//declare and initialize the 2 dimensional array
		String books[][]=new String[5][2];
		//here I am manually populating it so you can
		//see the structure. Think how you would let a user
		//populate such and array with loops
		books[0][0]="Lord of the Rings";
		books[0][1]="JRR Tolkein";
		books[1][0]="Dune";
		books[1][1]="Frank Herbert";
		books[2][0]="The Martian Chronicles";
		books[2][1]="Ray Bradbury";
		books[3][0]="Foundation";
		books[3][1]="Isaac Asimov";
		books[4][0]="American Gods";
		books[4][1]="Neil Gaimon";
		
		//we will allow the user to enter a title
		//and we will return the author
		System.out.println("Enter a book title");
		String title = scan.nextLine();
		//this is the default response since most books
		//are not on our list
		String response ="Not a title in our list";
		//look at the loop we try to match the title 
		//by matching the index (via the loop counter)
		//and the 0 index of the second dimension
		//we return the 1 index of the second dimension
		//which holds the author's name
		for (int i = 0; i < 5; i ++) {
			if (title.equals(books[i] [0])) {
				response ="the author is " + books[i][1];
				break; //if we match we break the loop
			}
			
		}
		System.out.println(response);
	}

}
