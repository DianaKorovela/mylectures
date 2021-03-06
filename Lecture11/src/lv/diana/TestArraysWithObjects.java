package lv.diana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArraysWithObjects {

	public static void main(String[] args) {
		Integer intObj = 40;
		Double doubleObj = 40.89;
		System.out.println(intObj);
		System.out.println(doubleObj);

		ArrayList<Integer> intArrays = new ArrayList<>();
		
		intArrays.add(40);
		intArrays.add(23); 
		intArrays.add(4);
		intArrays.add(9);
		
		System.out.println(intArrays);
		
		Collections.sort(intArrays); // Sorts Arrays 1, 2, 3 intead 2,1,3 
		System.out.println(intArrays);
		
		

	}

}
