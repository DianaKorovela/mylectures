package lv.diana;

public class RefactorMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	

		System.out.println(getGreating(20));
		getGreatingWithVoid(20); 
		
	}
	

		public static String getGreating(int time){
			if(time <= 13){
				return "Good morning"; 
			}else if (time <18){
				return "Good day"; 
			}else{ 
			return "Good evening";
			}
			
		
}
		public static void getGreatingWithVoid(int time){
			
		if (time <= 20) {
			System.out.println("Good morning");
		} else if (time < 18) {
			System.out.println("Good day");
		} else {
			System.out.println("Good evening");

		}
		}		
	
}
