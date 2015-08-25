/**
 * 
 */
package geometricShapes;

public class Circle implements ShapeIF{
	public static final double PI = 3.14 ;
	private double radius;
	
	
	public Circle(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double perimeter() throws Exception{
		return 2 * PI * getRadius();
	}
	
	public double area() throws Exception{
		return PI * getRadius() * getRadius();
	}
}
