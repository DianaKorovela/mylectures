package lv.diana.user;

import lv.diana.graph.Point2D;

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
		public void addCOurseGrade(String name, int grade){
	}
		
		public void addCourseGrade(String course, int grade){
		//	this.courses = courses;
			courses[numCourses] = course;
			grades[numCourses] = grade;
		}
		
	public void pirntGrases(){
		
	}
	public double getAverageGrade(){
		return 0.0;
		
	}
}