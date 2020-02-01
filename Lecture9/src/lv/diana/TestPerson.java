package lv.diana;

public class TestPerson {

	public static void main(String[] args) {
		

		String[] strArr = new String[12];
		strArr[0] = "Sport";
		strArr[1] = "Math";

		System.out.println(strArr[0]+", "+strArr[1]);
		
	Teacher teacher1 = new Teacher("Toms", "Riga"); 
	System.out.println(teacher1.toStirng());
	//teacher1.addCourses("Sport");
		String[] courses = {"Sport", "Math"}; 
		
		for(String course : courses){
			teacher1.addCourses(courses); 
		}
	
		Teacher t1 = new Teacher("Toms B", "Rīgas iela");
		System.out.println(t1.toStirng());
		String[] coursesForT1 = {"CS10", "AL", "BIO", "CS10"};
		for(String c: coursesForT1){
			if(t1.addCourses(c)){
				System.out.println(c + "added");
			}
			else{
				System.out.println(c + "can not be added");
			}
			
		}
	}
}

	


