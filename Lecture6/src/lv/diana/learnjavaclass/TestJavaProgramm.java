package lv.diana.learnjavaclass;

public class TestJavaProgramm {

	public static void main(String[] args) {
		Box boxObject = new Box(); // Constructor default 

		double volume;

		double width = 20.23; // can use also boxObject.width = 20.23
		
		boxObject.width = 20.23;
		boxObject.height = 3.42;
		boxObject.depth = 15.2;

		double result = boxObject.getVolume();
		System.out.println("Volume from method " + result);

		//volume = boxObject.width * boxObject.height * boxObject.depth;

	//	System.out.println(boxObject.width);
	//	System.out.println("Volume " + volume);

	//	Box boxObject2 = new Box();
	//	System.out.println(boxObject2.width);
		
		
		
	}

	
	
	
}
