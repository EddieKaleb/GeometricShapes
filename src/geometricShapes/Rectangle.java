/**
 * @author Rebeca Galdino
 * @date 21/08/2015
 * Rectangle class from Geometric Shapes project. Owns the perimeter and area methods of the rectangle.
 */
package geometricShapes;

public class Rectangle extends AbstractQuadrilateral {


	public Rectangle(double side, double height) {
		super(side, height);
	}
	
	public double perimeter(){
		return (2 * side)  + (2 * height);
	}
	
	public double area(){
		return side * height;
	}
	
	
	
}
