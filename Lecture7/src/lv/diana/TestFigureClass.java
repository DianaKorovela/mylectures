package lv.diana;

import lv.diana.geometricfigures.Circle;

public class TestFigureClass {

	public static void main(String[] args) {
	//	Circle figure = new Circle; // Fix this 
		Circle figure1 = new Circle(40.2); 
		Circle figure2 = new Circle(20.5); 
		
//	System.out.println(figure.getColor() + " " + figure.getRadius()); // Fix this 
		System.out.println(figure1.getColor() + " " + figure1.getRadius());
		System.out.println(figure2.getColor() + " " + figure2.getRadius());
		
		
		System.out.println("Radius of figure "+figure1.getArea());
		System.out.println(figure2.toString());
		
		System.out.println(figure2.toString()+" and area is " +figure2.getArea()); 	
		
	}
	

}
