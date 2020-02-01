package lv.diana.interfaces;

public class Rectangle implements Shape{

	private int lenght;
	private int width;
	public int getWidth;
	
	public Rectangle(int lenght, int width){
		this.lenght = lenght; 
		this.width = width; 
		
	}

	@Override
	public String toString() {
		return "Rectangle [lenght=" + lenght + ", width=" + width + "]";
	}

	@Override
	public double getArea() {
		return lenght * width;
		
		
	}

	public String getLenght() {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
