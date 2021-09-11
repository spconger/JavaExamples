package chapterOneEx;
import java.util.Scanner;
/*
 * This class takes a name and a birth year
 * as in integer, then subtracts that year
 * from the current year to give an age
 * It uses the scanner object to take in
 * input
 */

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variable for current year
		int currentYear = 2021;
		//initialize the scanner object
		Scanner scnr=new Scanner(System.in);
		//prompt for name
		System.out.println("Enter your name");
		//using scanner to get input
		String name = scnr.nextLine();//next line for string
		//prompt for the year born
		System.out.println("Enter the year you were born.");
		//use scanner to get input
		int birthYear=scnr.nextInt(); //next integer
		//do calculation
		int age=currentYear - birthYear;
		//output string
		System.out.print("Your age is ");
		//output result
		System.out.println(age);

	}

}
