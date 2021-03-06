package lv.diana;

import lv.diana.interfaces.Rectangle;
import lv.diana.interfaces.Shape;
import lv.diana.interfaces.Triangle;

public class TestInterface {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 23;

		Rectangle rectangle = new Rectangle(num1, num2);

		System.out.println(rectangle.getLenght() + " " + rectangle.getWidth);

		Shape figure = new Rectangle(5, 10);
		System.out.println(figure.toString());
		System.out.println(figure.getArea());

		Shape figure1 = new Triangle(20, 50);
		System.out.println(figure1.toString());
		System.out.println(figure1.getArea());

	}

}
