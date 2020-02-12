package lv.diana;

import lv.diana.repeatJavaClassOOP.ClassExtendAbstractClass;
import lv.diana.repeatJavaClassOOP.EncapsClass;
import lv.diana.repeatJavaClassOOP.ImplemetInterface;
import lv.diana.repeatJavaClassOOP.MyClass;
import lv.diana.repeatJavaClassOOP.MyClassConstructor;
import lv.diana.repeatJavaClassOOP.MyClassMethods;
import lv.diana.repeatJavaClassOOP.MyEnums;

public class  TestOOP {

	public static void main(String[] args) {
		MyClass newObj = new MyClass(); 
		MyClass newObj2 = new MyClass(); 
		String strObj = "hello";
		String strObj2 = "hello"; 
		
		System.out.println(newObj.equals(newObj2));
		System.out.println(strObj.equals(strObj2)); // Use this to compare OBJ instead of == 
		
		System.out.println(newObj.x);
		
//		MyClassMethods myObjMethod = new MyClassMethods(); 
//		myObjMethod.myMethod();
//		
//		myObjMethod.myStringMethod();
//		System.out.println(myObjMethod.myStringMethod());
		
		
	MyClassMethods myObjMethod = new MyClassMethods(); 
	double numberDouble = 0; 
	numberDouble = myObjMethod.returnDouble();
	System.out.println(numberDouble);
	
	System.out.println(myObjMethod.returnChar(1009, 20));
	
	MyClassConstructor myConstructorObj = new MyClassConstructor(1999L,"BMW"); 
	
	EncapsClass objEncaps = new EncapsClass(); 
	System.out.println(objEncaps.getUser());
	objEncaps.setUser("Diana");
	System.out.println(objEncaps.getUser());

	ImplemetInterface objInterFace = new ImplemetInterface(); 
	objInterFace.sendEmail();
	System.out.println(objInterFace.sendEmailCount());
	
	MyEnums status = MyEnums.UN; // Change status here 
	
	System.out.println("This object is to "+status);
	System.out.println(MyEnums.LOW);
	
	switch(status){
	case LOW: 
		System.out.println("Low status");
		break; 
	case HIGH:
		System.out.println("High status");
		break; 
	case MEDIUM: 
		System.out.println("Medium status");
		break; 
	default:
		System.out.println("No status");
	}
	
	String numberStr = "248";
	int numberInt = Integer.parseInt(numberStr);
	int result = 30 + numberInt; 
	System.out.println(numberInt);
	System.out.println(result);
	
	String nuberStrValue = "20"; 
	Integer valueInt = Integer.valueOf(nuberStrValue);
	System.out.println(valueInt);
	
	ClassExtendAbstractClass objAbstractClass = new ClassExtendAbstractClass();
	objAbstractClass.sleep();
	objAbstractClass.abstractMethod();
	
	
}
}
		
