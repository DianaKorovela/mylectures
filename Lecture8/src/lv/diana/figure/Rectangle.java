package lv.diana.figure;

public class Rectangle {

	private float lenght = 1.0f;
	private float width = 1.0f;
	
	
	public Rectangle(){ // 1st constructor
		this.lenght = 0;
		this.width = 0;
	
		
	}

	public Rectangle(float lenght, float width) { // 2nd constructor
		
		this.lenght = lenght;
		this.width = width;
	}

	public float getLenght() { // getter and setters 
		return lenght;
	}

	public void setLenght(float lenght) {
		this.lenght = lenght;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public String toString(){ // To string
		return "Lenght: "+this.lenght +" Width: " +this.width; 
		
	
	}
	
	
	
}
