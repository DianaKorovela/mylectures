
public class ForLoopAndIfElseBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] number = {1, 3, 4, 2};
		// Find in array number ?? & print its name in Console 
		int checkNumber = 5; 
		if (number[0] == checkNumber){
			System.out.println("ONE");
			}else{
				System.out.println("Not matching");
				
			}
		for(int i = 0; i < number.length; i++){
		if(number[i] == checkNumber){
			System.out.println(number[i]);
			break; 
		}else{
			System.out.println("Note number in array");
		
		}
		}

	}

}
