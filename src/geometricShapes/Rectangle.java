/**
 * @author Rebeca Galdino
 * @date 21/08/2015
 * Rectangle class from Geometric Shapes project. Owns the perimeter and area methods of the rectangle.
 */
package geometricShapes;

public class Rectangle extends AbstractQuadrilateral {

	/**
	 * Rectangle class's constructor. Calls the constructor of the abstract class AbstractQuadrilateral
	 * @param side
	 * @param height
	 */
	public Rectangle(double side, double height) {
		super(side, height);
	}
	
	/**
	 * Perimeter method. 
	 * @overrides the AbstractQuadrilateral's method
	 */
	public double perimeter(){
		return (2 * side)  + (2 * height);
	}
	
	/**
	 * Area method. 
	 * @overrides the AbstractQuadrilateral's method
	 */
	public double area(){
		return side * height;
	}
	
	
	
}
