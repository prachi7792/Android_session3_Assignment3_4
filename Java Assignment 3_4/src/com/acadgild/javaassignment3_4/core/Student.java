/**
 * this for files
 * @author Acer
 * 
 * @date Apr 21, 2017
 */
package com.acadgild.javaassignment3_4.core;

/**
 * this for classes
 */
public class Student {
	public int reg;
	public int Roll;
	public String name;
	static public String collage= "NIIT";

	public Student(int reg, int Roll,String name) {
	this.reg = reg;
	this.Roll = Roll;
	this.name = name;
	}
	public  float markToGrade(float mark){
	float gradePoint;
	if(mark>=80 && mark<=100)
	gradePoint=(float) 4.0;
	else if(mark>=75 && mark<=79)
	gradePoint=(float) 3.75;
	else if(mark>=70 && mark<=74)
	gradePoint=(float) 3.50;
	else if(mark>=65 && mark<=69)
	gradePoint=(float) 3.25;
	else if(mark>=60 && mark<=64)
	gradePoint=(float) 3.00;
	else if(mark>=55 && mark<=59)
	gradePoint=(float) 2.75;
	else if(mark>=50 && mark<=54)
	gradePoint=(float) 2.50;
	else if(mark>=45 && mark<=49)
	gradePoint=(float) 2.25;
	else if(mark>=40 && mark<=44)
	gradePoint=(float) 2.00;
	else
	gradePoint=(float) 0.00;
	return gradePoint;
	}
	
}
