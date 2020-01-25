package lv.diana.repeatarrays;

import java.util.Scanner;

public class ScannerAndArrays {
	
	//User input array length;
	//User adds to element value; 
	//Array values are printed to console
	//Create method for printing out array values 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];
		System.out.println("Input first array value");
		arr[0] = sc.nextInt();
		System.out.println("Input second array value");
		arr[1] = sc.nextInt();

		System.out.println(arr[0]+ ", "+arr[1]);
		
	}

}
