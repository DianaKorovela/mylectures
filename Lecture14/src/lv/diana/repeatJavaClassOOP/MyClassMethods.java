package lv.diana.repeatJavaClassOOP;

public class MyClassMethods {

	public static void myMethod() {

		System.out.println("Hello Diana");

	}

	public String myStringMethod() {

		myMethod();

		return "Done";
	}

	public double returnDouble() {
		return 0;
	}
	
	public char returnChar(int a, int b){
		int charFromInt = a + b; 
		
		char charVariable = (char)charFromInt;
		return charVariable; 

	}
}
