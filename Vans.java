package com.spconger.vanexample;
/*
 * This program uses integer division and
 * the modulus to determine how many vans
 * a company will need to transport a given
 * number of passengers. It does use a branching
 * statement that is not covered until
 * a later chapter
 * Steve Conger 9/14/2021
 */
import java.util.Scanner;

public class Vans {

	public static void main(String[] args) {
		//set a constant for van size
		final int VANCAPACITY=8;
		
		//initialize Scanner
		Scanner scan =new Scanner(System.in);
		
		//get input for the number of people
		System.out.println("How many people will be on this excursion? ");
		//get input
		int numberOfPeople=scan.nextInt();
		//do integer division
		int numberOfVans=numberOfPeople / VANCAPACITY;
		
		//check to see if there are any left over people
		//using the modulus
		
		int remainder = numberOfPeople % VANCAPACITY;
		
		//This is the branching statement that will be covered
		//later. 
		//if there is a remainder then add one more van
		if (remainder != 0) {
			numberOfVans += 1; //add one to vans
		}
		
		System.out.print("We will need ");
		System.out.print(numberOfVans);
		System.out.println(" vans.");
		

	}

}
