
public class OperatorMath {

	
	public static void main(String[] args) {
		double num1 = 0.4d;
		double num2 = 0.20d;
		double result;
		double result2;
		double result3;
		double result4; 
		double result5; 
		
		char add = '+'; // char operator '+'; same 
		char sub = '-';
		char mult = '*';
		char divi = '/';
		char mod = '%'; 
		
		result = num1 + num2;
		result = num1 - num2;
		result = num1 * num2; 
		result = num1 / num2; 
		result = num1 % num2;
		
		
		System.out.println(num1 + " "+add+" "+num2+" = "+result);
		System.out.println();
		System.out.println(num1 + " "+sub+" "+num2+" = "+result);
		System.out.println();
		System.out.println(num1 + " "+mult+" "+num2+" = "+result);
		System.out.println();
		System.out.println(num1 + " "+divi+" "+num2+" = "+result);
		System.out.println();
		System.out.println(num1 + " "+add+" "+num2+" = "+result);
		System.out.println();
		System.out.println(num1 + " "+add+" "+num2+" = "+result);
		System.out.println();
		
		int a = 10; 
		int b = 3;
		int x  = a % b;
		System.out.println("x = "+x);		
		
		int i = 1;
		i++;
		System.out.println(i);
		
		int k = 2;
		//return increment result ++ increments by 1 value 
		int p = ++k; 
		System.out.println("p after increment: "+p);
			
		p = k++; 
		System.out.println("p after increment: "+p);
		
		int o = 2;
		int f = o++; 
	
		System.out.println("p after increment: "+f);
		
		
		
	}

}