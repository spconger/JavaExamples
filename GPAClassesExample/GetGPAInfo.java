package com.spconger.GPAClassesExample;

import java.util.Scanner;
import java.util.ArrayList;
/*
 * This class provides the user interface to use
 * the Grade and GPA classes.
 * The GPA class is declared at class level
 * so that the same GPA class is used by
 * all the methods. The Grade class is declared
 * inside the while loop in enterGrades(),
 * because each Grade should be a new  and 
 * separate object. 
 * The constructor initializes the GPA and scanner
 * and calls the introduction method
 * The introduction method describes the overall
 * purpose of the program and the calls
 * the enterGrades method. 
 * The enterGrades method loops for as many
 * grades as the user wants to enter
 * It gets the information for class name,
 * grade and credits. It initializes a Grade
 * class and passes those through the 2nd constructor.
 * Then it passes the grade class to GPA
 * and adds it to the grades ArrayList.
 * When done it calls the display GPA
 * which displays the classes, grades and credits
 * and then the GPA
 */

public class GetGPAInfo {
	//define class level variables (fields)
	GPA gpa;
	Scanner scan;
	
	//use default constructor in initialize fields and call introduction
	public GetGPAInfo() {
		gpa = new GPA();
		scan = new Scanner(System.in);
		introduction();
	}
	
	//introduce program and call enterGrades()
	public void introduction() {
		System.out.println("This program will calculate your GPA.");
		System.out.println("First you will need to enter the class name, ");
		System.out.println("the grade and the number of credits ");
		enterGrades();
		
	}
	
	//enter grades in a loop until done
	public void enterGrades() {
		System.out.println("Enter your grades and credit information.");
		String more="y";
		while (more.equals("y")) {
			//get the values for the grade object
			System.out.println("Enter the class name: ");
			String name = scan.next();
			System.out.println("Enter the grade point for the class: ");
			double gp = scan.nextDouble();
			System.out.println("Enter the number of credits for the class: ");
			int credits = scan.nextInt();
			//Intialize the Grade and pass it the values
			Grade g = new Grade(name, gp, credits);
			//add it to the grades list in GPA
			gpa.addGrade(g);
			//Determine whether to skip loop or continue
			System.out.print("y to continue, any thing else to exit: ");
			more = scan.next();
			System.out.println();
			
			
			
		}
		//when loop is done call displayGPA
		displayGPA();
	}
	
	public void displayGPA() {
		//get a copy of the array list from GPA
		ArrayList<Grade> grades = gpa.getGrades();
		//loop through it to display its contents
		for (Grade g : grades) {
			System.out.println(g.getClassName() + ", " + g.getGradePoint() + ", " + g.getGredits());
		}
		System.out.println();
		//call and display the GPA
		System.out.println("Your overall GPA is " + gpa.calculateGPA());
	}

}
