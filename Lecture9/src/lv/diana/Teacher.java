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
	
	public void addCourses(String[] courses2){
		courses[numCourses] = courses2; 
		System.out.println(Arrays.toString(this.courses));
		numCourses ++;
		return true; 
	}
	
	public boolean addCourses(String course){
		for (int i = 0; i<numCourses; ++i){
			if(courses[i].equals(course)){
				return false; 
				
			}
		}
		return false;
		
	}
	
	public String toStirng(){
		return "Teacher: "+super.toString(); 	
	
}
	public boolean removeCourses(String course)
	boolean found = false; 
	
	int courseIndex = -1;
	for(int = 0; i <numCourse; i++){
		if(courses[i].equals(course)){
			courseIndex = i; 
			found = true; 
			break; 
	if(found){
		for(int i = courseIndex; i <numCourses-1; i++){
			courses[i] = courses[i+1]; 
				}
		numCourses --;
		return true;
	}else{ 
		return false;
	}
			
		}
	}
}
