public class IfElseAndTeranaryOperator {

	public static void main(String[] args) {
		boolean test = true;
		
		if (test) {
			System.out.println("Test pass true");
		} else {
			System.out.println("Test pass false");

			
		}
		String res = (test) ? "Test pass ture" : "Test pass false";
		System.out.println(res);
		
		
		
		
		//Ternary 
		int num1 = 5;
		int num2 = 10;
		int result; 
		
		result = (num1 < num2) ? (num1 + num2) : (num1 - num2);
		//Ternary variable = (condition) ? return true : return false; 
		System.out.println(result);
		
		

	}

}
