package lv.diana;

public class LearnMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // void key word not return type //
												// static key word //
		// public private protected

		getMyName();
		getMyName();
		getMyName();
		getMyName();
		System.out.println("________________________");
		getMyCity();
		 
		
		LearnMethods classObject = new LearnMethods ();
		
		classObject.doYouHaveDog(); 
		
	}

	public static void getMyName() {
		System.out.println("My name is Diana");
	}

	public static void getMyCity() {
		getMyName();
		System.out.println("My city is Riga");
	}

	public static void doYouHaveDog() {
		doYouHaveDog();
		System.out.println("No");
	}

}
