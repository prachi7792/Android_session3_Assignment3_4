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
public class StudentResult {

	/**
	 * The main method.
	 *
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstSemester std1 = new FirstSemester("Shubham", 127, 149);      //Shubham roll no and registration no
		std1.setMarks(60,70);    // Shubham's marks
		System.out.println("Welcome to Student's Result Processing System");  //welcoming to the result system of student
		System.out.println("\nFirst Student's Result Info:");            // Showing Student's Result Information.
		std1.getSubject();      // Subjects are Introduced.
		std1.showResult();      // Showing Average Marks i.e GPA- Grade Point Average of Student.
		std1.display_info();    // showing short display information of student below the first semester.

		SecondSemester std2 = new SecondSemester("Shantanu", 227, 249); //Shubhra roll no and registration no
		std2.setMarks(70,80);  // Shantanu's marks
		System.out.println("\n\nSecond Student's Result Info:");        // Showing  Second Student's Result Information.
		std2.getSubject();     // Subjects are Introduced.
		std2.showResult();     // Showing Marks i.e GPA- Grade Point Average of Student.
		std2.display_info();   // showing short display information of student below the second semester.
		
		ThirdSemester std3 = new ThirdSemester("Fatima", 220, 246);     //Fatima roll no and registration no
		std3.setMarks(50,80);  // Fatima's marks
		System.out.println("\n\nThird Student's Result Info:");         // Showing Third Student's Result Information.
		std3.getSubject();     // Subjects are Introduced.
		std3.showResult();     // Showing Marks i.e GPA- Grade Point Average of Student.
		std3.display_info();   // showing short display information of student below the third semester.
	}
	

}
