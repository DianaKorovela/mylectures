package lv.diana;

public class LearnMethodsWithParameters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// cast 
		double radius = 30.2; 
		
		int resultWithCastInt = getArea(30.2);  // this method cast double to int
		double result = getAreaforCircle(radius);
		System.out.println("Area "+resultWithCastInt);
		System.out.println("Area "+result);
		String color= "red"; 
		
		System.out.println(getColorAndArea(color, result));
	}
	
	public static int getArea(double radius){
		double result = Math.PI * radius * radius; 
		return (int) result; 
	}

	public static double getAreaforCircle(double radius){
		double result = Math.PI * radius * radius; 
		return result; 
		
		
	}

	public static String getColorAndArea(String color, double area){
		return "Color: " + color + " and area " + area; 
		
	}
}
