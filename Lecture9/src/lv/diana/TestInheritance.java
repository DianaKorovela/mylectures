package lv.diana;

import lv.diana.graph.Point2D;
import lv.diana.graph.Point3D;
import lv.diana.graph.Point4D;

public class TestInheritance {

	public static void main(String[] args) {
		// TIPS // MAINIGAIS
		Point2D point = new Point2D();
		System.out.println(point.toString()); // 1 CONST
		Point2D pointXY = new Point2D(10,-2);

		System.out.println(pointXY.toString()); // 2 CONST
		// toString var nerakstīt jo jau tā ir izveidota

		pointXY.setX(8);
		pointXY.setY(-6);
		System.out.println(pointXY);
		
		System.out.println("x is:"+pointXY.getX());
		System.out.println("x is:"+pointXY.getY());
		
		
		Point3D pointXYZ = new Point3D(3,1,10); 
		System.out.println(pointXYZ);
		
		pointXYZ.setY(-99);
		System.out.println(pointXYZ);
	

	Point4D pointXYZT = new Point4D(3,4,2,2);
	System.out.println(pointXYZT);
	
}
}