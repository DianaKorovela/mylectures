import java.util.Scanner;


public class ScannerCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number 1: ");
		int num1 = scanner.nextInt();
		System.out.println("Number 2 : ");
		int num2 = scanner.nextInt(); 
		scanner.nextLine();
		System.out.println("Input operator /+*% :");
		String operatorSymbol = scanner.nextLine(); // addition
		int result = 0;
		
		if(operatorSymbol.equals("+"));{
		result = num1 + num2; 
		}else if{(operatorSymbol.equals("/"));
		result = num1 / num2;
		
		//if(addition.equals("+")){
			
		}
		
System.out.println(result +" = "+ num1 +" "+operatorSymbol+" "+ num2);
		//System.out.println("Test result: "+result);

	}

}
