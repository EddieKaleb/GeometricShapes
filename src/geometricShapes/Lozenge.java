/**
 * @author Rebeca Galdino
 * @date 21/08/2015
 * Lozenge class from Geometric Shapes project. Owns the perimeter and area methods of the lozenge.
 */
package geometricShapes;

public class Lozenge extends AbstractQuadrilateral {
	
	private double diagonal;
	
	/**
	 * Lozenge's class constructor. Calls the abstract class AbstractQuadrilateral's constructor and sets a diagonal element.
	 * @param side
	 * @param height
	 * @param diagonal
	 */
	public Lozenge(double side, double height, double diagonal) {
		super(side, height);
		setDiagonal(diagonal);
	}
	
	/**
	 * Perimeter method. 
	 * @overrides the AbstractQuadrilateral's method
	 */
	public double perimeter() throws Exception{
		if(side <= 0 || height <= 0 || diagonal <= 0)
			throw new Exception("Wrong(s) value(s) Typed. Should be greater than 0!");	
		else
		return 4*side;
	}
	
	/**
	 * Area method. 
	 * @overrides the AbstractQuadrilateral's method
	 */
	public double area() throws Exception{
		if(side <= 0 || height <= 0 || diagonal <= 0)
			throw new Exception("Wrong(s) value(s) Typed. Should be greater than 0!");	
		else
		return (height * diagonal)/2;
	}
	
	/**
	 * Get diagonal method  
	 * @return the diagonal's value
	 */
	public double getDiagonal() {
		return diagonal;
	}
	
	/**
	 * Set diagonal method
	 * @param diagonal
	 */
	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}
}
