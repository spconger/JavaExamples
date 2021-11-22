package com.spconger.GPAClassesExample;

import java.util.ArrayList;
/*
 * This class calculates a GPA grade
 * It contains an ArrayList object that takes
 * Grade objects as its type
 * The <Grade> notation is for Generics
 * that don't get their type until runtime,
 * a somewhat advance concept.
 * The addGrade method adds a grade object 
 * to the list. the getGrades returns
 * the list for another user or class
 * The calculateGPA, loops through the list
 * and gets the weight and credits needed
 * to calculate the weighted average
 * and then does the calculation
 * returning the GPA
 */

public class GPA {
	ArrayList<Grade>grades;
	
	//default constructor which initializes
	//the arraylist
	public GPA() {
		grades = new ArrayList<Grade>();
		
	}
	
	//method to add a Grade object to the list
	public void addGrade(Grade g) {
		grades.add(g);
	}
	
	//get the array list
	public ArrayList<Grade> getGrades(){
		return grades;
	}
	
	//calculate the GPA
	public double calculateGPA() {
		double gpa=0.0;
		double weight=0.0;
		int sumCredits=0;
		for (Grade g : grades) {
			weight += g.getGradePoint() * g.getGredits();
			sumCredits += g.getGredits();
		}
		
		//this is just to make sure we don't try
		//to divide by 0
		if (sumCredits != 0) {
			gpa=weight / sumCredits;
		}
		
		return gpa;
	}
	
	

}
