package lv.diana;

public class testArrayAndList {

	public static void main(String[] args) {
	
		String [] arr = new String [10];
		String [] arrWith = {"1", "1"};
		for(int i = 0; i < arr.length; i++){
			arrToString(arr);
			System.out.println();
			
			System.out.println("index number is "+i+""+arr[i]);
		}
for (int i = 0; i <arrWith.length; i++){
	System.out.println("index number is "+i+""+arr[i]);
}
	}
public static void arrToString(String[] arr){
	for(int i = 0; i < arr.length; i++);
	System.out.println("index number is "+i+""+arr[i]);
}
public static void adElementsToArr(String[] arr){
	
	for(int i = 0; i < arr.length; i++);
	arr[i] = arr[i]+i;

arrToString(arr);
}
}

