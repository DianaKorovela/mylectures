package lv.diana;

import java.util.ArrayList;

public class TestTaskArray {

	
	public static void main(String[] args) {
		ArrayList <String> cars = new ArrayList <>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		for(String car : cars){ // For each
			System.out.println(car);
			
		}
	}

}
