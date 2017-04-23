/**
 * this for files
 * @author Acer
 * 
 * @date Apr 21, 2017
 */
package com.acadgild.javaassignment3_4.core;

// TODO: Auto-generated Javadoc
/**
 * this for classes.
 */
public class ThirdSemester extends Student implements Result {
	
	/** The sub 2. */
	private String sub1, sub2;
	
	/** The credit 2. */
	private Float mark1, mark2, grade1, grade2,credit1,credit2;
	
	/**
	 * Instantiates a new third semester.
	 *
	 * @param name the name
	 * @param roll the roll
	 * @param reg the reg
	 */
	public ThirdSemester(String name, int roll, int reg) {
		super(reg, roll, name);
		// TODO Auto-generated constructor stub
	}
	
	
	/* (non-Javadoc)
	 * @see com.acadgild.javaassignment3_4.core.Result#setMarks(float, float)
	 */
	@Override
	public void setMarks(float mark1,float mark2) {   //giving Float Marks and Grade.
	this.mark1=mark1;
	this.mark2=mark2;
	this.grade1=markToGrade(mark1);
	this.grade2=markToGrade(mark2);
	}
	
	/* (non-Javadoc)
	 * @see com.acadgild.javaassignment3_4.core.Result#calculateGpa()
	 */
	@Override
	public float calculateGpa() {   
	return (grade1* credit1+ grade2*credit2) / (credit1+credit2);  // Result Calculator
	}

	/* (non-Javadoc)
	 * @see com.acadgild.javaassignment3_4.core.Result#getSubject()
	 */
	@Override
	public void getSubject() {        //Subjects are Introduced.
	sub1="Core Java";
	sub2=".Net";
	credit1=(float)3.0;
	credit2=(float)4.0;
	}

	/* (non-Javadoc)
	 * @see com.acadgild.javaassignment3_4.core.Result#showResult()
	 */
	@Override
	public void showResult() {    //Result of the Student will be shown, GPA- Grade Point Average
	System.out.println("\nName: " + name + "\nRoll = " + Roll + "\nRegistration no: " + reg + "\n" + sub1 + " grade: " + grade1+ "\n" + sub2 + " grade: " + grade2 + "\nGPA: " + calculateGpa());
	}
	
	/**
	 * Display info.
	 */
	public void display_info()    //Providing Short information of the Student below Third Semester.
	{
		System.out.println("\nName: " + name + "\nRoll = " + Roll + "\nRegistration no: " + reg + "\n" + sub1 + " collage: " + collage);
	}
	
	/**
	 * The main method.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		//TODO Auto-generated method stub
	}



}
