public class Calculator {

	public static void main(String[] args) {
		char operatorMath = '+';
		double num1 = 20.0;
		double num2 = 24.5;
		double result;

		if (operatorMath == '+') {
			result = num1 + num2;
			System.out.println(num1 + num2);
		} else if (operatorMath == '/') {
			result = num1 / num2;
			System.out.println(num1 / num2);
		} else if (operatorMath == '*') {
			result = num1 * num2;
			System.out.println(num1 * num2);
		} else if (operatorMath == '-') {
			result = num1 - num2;
			System.out.println(num1 - num2);
			System.out.println(result);
		} else {
			System.out.println("wrong data");
		}

		System.out.println("----------------------------------------------");

		switch (operatorMath) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + num2);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(num1 / num2);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 * num2);
			break;
		case '%':
			result = num1 % num2;
			System.out.println(num1 % num2);
			if (num1 >= num2) {
				result = num1 % num2;
				System.out.println(result);
			} else {
				System.out.println("If num1 is less than num2"
						+ " than result is num1: " + num1);
			}
			break;
		default:
			System.out.println("No such number or operator");

		}

	}

}
