package lv.diana;

import java.util.ArrayList;

public class TaskArrayMethods {

	public static void main(String[] args) {
ArrayList <String> cars = new ArrayList <>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		System.out.println(cars.indexOf("BMW")); 
		System.out.println(cars.isEmpty());
		System.out.println(cars.get(3));
		System.out.println(cars.set(0, "Opel")); // Replaces 
		cars.clear(); // Removes, can be used to empty Arrays
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++===");
		
		
		System.out.println();
		for(String car : cars){ // For each
			System.out.println(car);
			
		}
		System.out.println();
		cars.remove ("Ford"); // Removes 
		for(String car : cars){ // For each
			System.out.println(car);
	}
		
		System.out.println();
		System.out.println();
		cars.remove ("Ford"); // Removes 
		cars.remove ("Mazda"); 
		System.out.println(cars.size());
		for(String car : cars){ // For each
			System.out.println(car);
		
}
	}
}
