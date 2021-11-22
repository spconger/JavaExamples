package com.spconger.GPAClassesExample;
/*
 * The purpose of this class is to store data 
 * about a grade. It includes the class name
 * the final grade or gradepoint for the class
 * and the number of credits.
 * These three items are set up as class level
 * fields and as such are accessible by every
 * method in the class.
 * There are two constructors. A default constructor
 * that takes no parameters. It initializes all
 * the class level variables to 0 or empty strings.
 * If you do not have any other constructors
 * the default constructor happens automatically--
 * thus "default," but if you do have other constructors
 * you should manually initialize the variables.
 * The second overloaded constructor takes in
 * all the variables and passes them to the set
 * methods. This is better than simply assigning
 * the values because the sets might do some 
 * validation. (in this case they don't)
 * After the two constructors the rest of the methods
 * consist of setters and getters or 
 * mutators and assessors. They let a user
 * or another class set the values of the variable
 * and get the value returned
 */

public class Grade {
	
	//class level variable or fields
	String className;
	double gradepoint;
	int credits;
	
	//default constructor with initiators
	public Grade() {
		className="";
		gradepoint=0.0;
		credits=0;
	}
	
	//overridden constructor taking values
	public Grade(String name, double gp, int credits) {
		setClassName(name);
		setGradePoint(gp);
		setCredits(credits);
	}
	
	//setters and getters for each field.
	public void setClassName(String className) {
		this.className=className;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setGradePoint(double gradepoint) {
		this.gradepoint=gradepoint;
	}
	
	public double getGradePoint() {
		return gradepoint;
	}
	
	public void setCredits(int credits) {
		this.credits=credits;
	}
	
	public int getGredits() {
		return credits;
	}
	

		
}


