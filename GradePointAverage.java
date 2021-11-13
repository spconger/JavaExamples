package com.spconger.methodsExample;
/*
 * This program calculates a GPA which is a weighted average.
 * it is designed to show how to break a program into separate
 * methods. 
 * Ideally, each method should do only one thing. That makes it
 * easier to troubleshoot. If something goes wrong, there is
 * only one place to look.
 * The program has these methods:
 * introduction which describes the program. It returns void.
 * getNumberOfGrades which lets the use determine how many
 * grades to enter. It returns an integer value.
 * enterGradesAndCredits which takes an integer as a parameter 
 * and returns a 2 dimensional array. It allows the user
 * to populate the array with grades and credits. It does not 
 * validate that the grade entries are between 0 and 4, something 
 * that should be added.
 * getTotalWeight takes an integer and a 2 dimensional array
 * as parameters. It returns a double. This method calculates
 * the weight which consists of the the grade * the number
 * of credits.
 * getTotalCredits sums the credits. It takes an integer
 * and a 2 dimensional array as parameters and returns an integer.
 * calculateGPA takes two parameters a double and an integer.
 * It returns a double. It calculates the GPA by dividing the weight
 * by the number of credits.
 * The main method, as always, starts the running program. It calls
 * the various methods, gets their return values, and passes them
 * to the parameters of the methods that require them.
 * All these methods are static because the class contains the main,
 * and if one of the methods is static, they all have to be.
 * Static means that the method and variables are all loaded
 * instantly into the computer's memory and they stay there until
 * the program is finished. Non static methods are loaded when needed
 * and removed when they have finished their task. This is generally 
 * a better method of managing memory. We will look at it when
 * we look at using classes.
 */
import java.util.Scanner;

public class GradePointAverage {
	
	//declare scanner at class level so that it is available to all methods
	//it is generally better to declare as few class variables as possible
	//since it makes it harder to trace errors.
	
	static Scanner scan=new Scanner(System.in);
	
	//This method offers a brief introduction
	public static void introduction() {
		System.out.println("This program calculates a Grade Point Average. \n"
				+ "A GPA is a weighted Average so that a 2 credit class does not \n"
				+ "weigh as much as a 5 credit class. Grades are on a 4 point scale \n"
				+ "valid numbers are between 0.0 and 4.0 ");
	}
	
	//this method lets the user set the number of grades to enter
	public static int getNumberOfGrades() {
		System.out.print("Enter the number of final grades you want to enter ");
		int number = scan.nextInt();
		return number;
		
	}
	
	//this method creates a 2 dimensional array. Notice the loop
	//and how it distinguishes between grades and credits
	public static double[][] enterGradesAndCredits(int num) {
		double grades[][] = new double[num][2];
		
		for(int i=0; i < num; i++) {
			System.out.println ("Enter the final grade ");
			grades[i][0]= scan.nextDouble();
			System.out.println("Enter the credits for the course ");
			grades[i][1]=scan.nextInt();
			
		}
		return grades;
		
	}
	
	//this method loops through the 2 dimensional array
	//and calculate the weight
	public static double getTotalWeight(int num, double[][] grades) {
		double weightSum=0.0;
		
		for(int i=0; i< num; i++) {
			weightSum += grades[i][0] * grades[i][1];
			
		}
		return weightSum;
		
	}
	//this method loops through the 2 dimensional array
	//and sums the total credits
	public static int getTotalCredits(int num, double[][] credits) {
		
		int creditSum=0;
		for(int i=0; i< num; i++) {
			
			creditSum += credits[i][1];
		}
		return creditSum;
	}
	
	
	//this method calcuates the actual GPA
	public static double calculateGPA(double weight, double totalCredits) {
		double gpa=0.0;
		gpa=weight / totalCredits;
		return gpa;
	}
	
	
   //as always the starting point for program execution
	public static void main(String[] args) {
		// Call the introduction method. It takes no parameters 
		//and doesn't return anything
		introduction();
		//call the getNumberOFGrades method. It doesn't take
		//any parameters but it does return an integer.
		//we need to make a variable to receive that value.
		int number=getNumberOfGrades();
		//call the enterGradesAndCredits method. It takes
		//the number we just had returned from getNumberOfGrades
		//as a parameter and returns a 2 dimensional array
		double[][] grades=enterGradesAndCredits(number);
		//call gradeWeight which requires the number and the
		//2 dimensional array as parameters and returns a double
		double gradeWeight=getTotalWeight(number, grades);
		//same thing for the getTotalCredits, but it returns an int
		int creditTotal = getTotalCredits(number, grades);
		//pass the values we got from the previous 2 methods
		//to get the GPA returned
		double gpa=calculateGPA(gradeWeight, creditTotal);
		//print the results.
		System.out.println("Your overall GPA is " + gpa);
		
	}

}
