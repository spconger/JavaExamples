package com.spconger.looping1;

import java.util.Scanner;
/*
 * This program shows some basic while and for loops
 * The first while loop prints out the the square of
 * a number divided by 2 asking each loop if you want to continue
 * The second allows the user to enter as many grades
 * as they want. a -1, an illegal grade, is used to exit
 * the loop. It is also worth noting the scope of the
 * variables. Variables have the scope of block they are
 * declared in and can't be seen outside that scope. In
 * order to use grade, total and counter outside the while
 * loop, they have to be declared outside that loop--so they
 * have the scope of the main method. If we declared total 
 * and counter within the while loop the average equation
 * would return an error saying the variables were not 
 * declared.
 * After the grade while loop, there are two simple
 * for loops. For loops are good for when you know how
 * many loops you want to do. The first for loop
 * just counts 1 to 10. It is worth noting the ++ operator
 * iterates the integer variable by 1 each loop, the -- operator
 * subtracts 1 each loop.
 * The final for loop calculates a series of primes
 * and uses an if statement with a modulus to
 * print it in rows of 10.
 * Other notes the operator += in total += grade
 * is the same as saying total=total + grade
 */

public class LoopExamples {

	public static void main(String[] args) {
		// Initiate scanner
		Scanner scan = new Scanner(System.in);
		//status must be initiated  before the loop
		//if it is anything but y the loop
		//will never happen
		String status = "y";
		double number=1;
		
		while (status.equals("y")) {
			number = number * number / 2;
			number ++;
			System.out.println(number);
			//prompt the user to continue or leave the loop
			System.out.println("y to continue. Anything else will end the loop");
			status = scan.next();
		}
		System.out.println("Thank you, have a good day");
		
		//grade example
		//grade, total and counter must be declared outside the loop
		//to have the appropriate scope
		double grade = 0.0;
		double total = 0.0;
		int counter = 0;
		while (grade != -1) {
			System.out.println("Enter a grade -1 to quit");
			grade = scan.nextDouble();
			//we don't want to include the -1 in our average
			//or our count, so the if statement makes sure
			//only valid grades are counted 
			if(grade != -1) {
				total += grade;
				counter ++;
			}
			
		}
		//calculate the average
		double average = total / counter;
		System.out.println("The average is " + average);
		
		//for loop count
		//the first argument sets up the counter and where
		//to start the count. The second argument
		//sets the limit, where to end. It can be a 
		//variable, but the variable has to have a definite
		//value before the loop is declared. The i++ 
		//iterates i by adding 1 after each loop
		for (int i = 1; i <= 10; i ++) {
			System.out.print(i + ", ");
		}
		
		System.out.println(); //just to get some separation.
		//backwards count
		//-- is the opposite of ++
		for (int i = 10; i >=0; i--) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		System.out.println("*******************");
		
		int prime =0;
		
		//This is a curiosity. There is a quadratic equation
		//that produces 41 prime numbers starting
		//with 41. It falls apart after the 41st prime
		for(int i=1; i < 41; i++) {
			prime = i* i - i + 41;
			//the if is to make rows of 10 numbers
			// if it is not divisible by 10 with no remainder
			//print it
		    if (i % 10 != 0) {
		    	System.out.print(prime + ", ");
		    }
		    //otherwise print it and then start
		    //a new line
		    else {
		    	System.out.print(prime);
		    	System.out.println();
		    }

		}
	}

}
