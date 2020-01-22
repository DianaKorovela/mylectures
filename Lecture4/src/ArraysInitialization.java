import java.util.Arrays;


public class ArraysInitialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbersOfArrays = {33, 45, 23, 56};
		int lenghtOfArrays = numbersOfArrays.length;
	
		System.out.println(lenghtOfArrays); // 4 kastītes
		
		numbersOfArrays[3] = 20;
		
		System.out.println(Arrays.toString(numbersOfArrays));
		
		
		
	}
}
