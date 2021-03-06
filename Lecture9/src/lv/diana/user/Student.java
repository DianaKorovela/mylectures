package lv.diana.user;

import lv.diana.graph.Point2D;
import lv.diana.*;
import lv.diana.Teacher;


public class Student extends Person {
	
	private int numCourses;
	private String [] courses;
	private int [] grades; 
	private static final int MAX_COURSES = 12;

	public Student(String name, String address){
		super(name, address);
		this.numCourses = 0; 
		this.courses = new String [MAX_COURSES];
		this.grades = new int [MAX_COURSES];
	}
	//	public void addCOurseGrade(String name, int grade){
		
		public void addCourseGrade(String course, int grade){
		//	this.courses = courses;
			courses[numCourses] = course;
			grades[numCourses] = grade;
		}
		
	public void pirntGrases(){
		System.out.println();
		for(int i = 0; i < numCourses; ++i); 
		System.out.println(" "+courses[i] + ": "+grades[i]);		
	}

	public double getAverageGrade(){
		int sum = 0;
		for(int i = 0; i< numCourses; i++){
			sum = sum + grades[i];
			
		}
		return (double)sum/numCourses;
		
	}
	public String toString(){
		return " Teacher" +super.toString(); // finish
	}
}
