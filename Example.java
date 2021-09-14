package com.spconger.ChapterOneExample;

/*
 * This class takes a name and a birth year
 * as an integer, then it will subtract
 * the birth year from the current year
 * to give an age. It uses the scanner object.
 * Steve Conger September 14, 2021
 */
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentYear=2021; //create and assign variable
		//initial scanner
		Scanner scan=new Scanner(System.in);
		//prompt
		System.out.println("Enter your name ")
		//use scanner to get name
		String name=scan.nextLine();
		System.out.println("Enter the year you were born ");
		// use scanner to get year born
		int yearBorn=scan.nextInt();
		//calculate year
		int age=currentYear - yearBorn;
		//output result
		System.out.print("Your age is ");
		System.out.println(age);

	}

}
