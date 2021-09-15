package com.spconger.doubles;
/*
 * This class uses the Random function to generate
 * three random integers
 * These random integers are totaled
 * then the total is divide by the number
 * of random numbers to get an average.
 * the total and numberOfRandoms are cast to type double
 * The result is output in two ways
 * raw, and using the Math function round
 */

//import the Random class
import java.util.Random;

public class RandomAverage {

	public static void main(String[] args) {
		//initialize the random class
		Random rand = new Random();
		//set the number of random numbers
		int numberOfRandoms =3;
		
		//get 3 random numbers between 1 and 50
		int number1 = rand.nextInt(50) + 1;		
		System.out.println(number1);
		int number2 = rand.nextInt(50) + 1;
		System.out.println(number2);
		int number3 = rand.nextInt(50) + 1;
		System.out.println(number3);
		
		//Total the random numbers
		int total=(number1 + number2 + number3);
		//cast the total and numberOfRandoms to double
		//and divide to get the average
		double average=(double)(total) / (double)(numberOfRandoms);
		System.out.println("------");
		//output raw average
		System.out.println(average);
		//Round the average
		average=Math.round(average);
		//output rounded avareage
		System.out.println(average);
	}
}