package lv.diana;

import java.util.ArrayList;

public class TestArrayList {

	
	public static void main(String[] args) {
		String[] arr = new String[2]; 
		System.out.println(arr.length);
		arr[0] = "ElementName"; 
		System.out.println(arr[0]);
		
		ArrayList <String> array = new ArrayList <>();
		System.out.println(array.size()); // Will be useful for Loops
		array.add("Element to Array");
		array.add("Element");
		array.add("2");
		System.out.println(array);
		System.out.println(array.size());
	}
	
	

}
