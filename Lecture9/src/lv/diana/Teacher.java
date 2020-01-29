package lv.diana;

import java.util.Arrays;
import lv.diana.user.Person;


public class Teacher extends Person {
	private int numCourses; 
	private String[] courses;
	private static final int MAX_COURSES = 4; 
	
	public Teacher (String name, String address){
	super(name, address);
	this.numCourses = 0; 
	this.courses = new String[MAX_COURSES];
	}
	
	public void addCourses(String course){
		courses[numCourses] = course; 
		System.out.println(Arrays.toString(this.courses));
		++numCourses; 
	}
	
	public boolean removeCourses(String course){
		return true; 
	}
	
	public String toStirng(){
		return "Teacher: "+super.toString(); 	
	}
}