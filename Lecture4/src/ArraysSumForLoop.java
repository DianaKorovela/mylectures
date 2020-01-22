
public class ArraysSumForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] marks = {76, 23, 42};
		// Sum all values in arrays
		// Print in console
		// int result = 10;
		// int test = 90;
		// result = 200;
		// int testInt = 90;

		// System.out.println("result value: "+result);

		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];

			System.out.println("Sum of marks: "+sum);
			
			int sumTest = 0;
			sumTest = sumTest + 200; // 200
			sumTest = sumTest +220;  // 200 + 220 = 420 
			
			System.out.println("Testing += operator: "+sumTest);
			
			// -= how this operator works 
			int subOperator = 600; 
			subOperator -= 200; 
			subOperator -= 100;
					
					System.out.println("Testing -= operator: "+subOperator);
			
		}
		// System.out.println(marks[0]+marks[1]);
		
		
		
	}

}
