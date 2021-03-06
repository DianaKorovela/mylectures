package lv.diana.geometricfigures;

public class Circle {
	
	
	private double radius;
	private String color;

	public static final double DEFAULT_RADIUS = 8.8;
	public static final String DEFAULT_COLOR = "RED";

	public Circle() {
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}

	public Circle(double r) {
		this.radius = r;
		this.color = DEFAULT_COLOR;
	}

	public Circle(double r, String c) {
		this.radius = r;
		this.color = c;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea(){
		return this.radius * this.radius * Math.PI; 
		
		
//	public String toString(){
//	return "Circle radius "+this.radius+" Circle color" +this.color; 
		
	}
		

	@Override // automatically generated 
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
	
	
	
	

}