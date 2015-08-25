/**
 * @author Thayanne Luiza
 * Cicle class from project Geometric Shapes. Owns the methods to calculate the circumference's value of perimeter and area.
 */
package geometricShapes;

public class Circle implements ShapeIF{
	public static final double PI = 3.14 ;
	private double radius;
	
	
	public Circle(double radius)throws Exception{
		if(radius >= 0 )
			this.radius = radius;
		else
			throw new Exception("Wrong value Typed. Should be greater than 0!");
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
