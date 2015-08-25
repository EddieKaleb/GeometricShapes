/**
 * @author Rebeca Galdino
 * @date 21/08/2015
 * Rhombus class from Geometric Shapes project. Owns the perimeter and area methods of the rhombus.
 */
package geometricShapes;

public class Rhombus extends AbstractQuadrilateral {
	
	private double smallestDiagonal;
	private double biggestDiagonal;
	
	

	/**
	 * Rhombus's class constructor. Calls the abstract class AbstractQuadrilateral's constructor and sets a smallestDiagonal element.
	 * @param side
	 * @param height
	 * @param smallestDiagonal
	 * @param biggestDiagonal
	 */
	public Rhombus(double side,double smallestDiagonal, double biggestDiagonal) {
		super(side, 0);
		setSmallestDiagonal(smallestDiagonal);
		setBiggestDiagonal(biggestDiagonal);
	}
	
	/**
	 * Perimeter method. 
	 * @overrides the AbstractQuadrilateral's method
	 */
	public double perimeter() throws Exception{
		if(side <= 0)
			throw new Exception("Wrong(s) value(s) Typed. Should be greater than 0!");	
		else
		return 4*side;
	}
	
	/**
	 * Area method. 
	 * @overrides the AbstractQuadrilateral's method
	 */
	public double area() throws Exception{
		if(biggestDiagonal <= 0 || smallestDiagonal <= 0)
			throw new Exception("Wrong(s) value(s) Typed. Should be greater than 0!");	
		else
		return (biggestDiagonal * smallestDiagonal)/2;
	}
	
	/**
	 * Get Height's value method
	 */
	public double rhombusHeight(double a, double side) throws Exception{
		if(a <= 0 || side <= 0)
			throw new Exception("Wrong(s) value(s) Typed. Should be greater than 0!");	
		else	
		return a/side;
		
	}
	
	
	
	
	/**
	 * Get smallestDiagonal method  
	 * @return the smallestDiagonal's value
	 */
	public double getsmallestDiagonal() {
		return smallestDiagonal;
	}
	
	/**
	 * Set smallestDiagonal method
	 * @param smallestDiagonal
	 */
	public void setSmallestDiagonal(double smallestDiagonal) {
		this.smallestDiagonal = smallestDiagonal;
	}
	
	/**
	 * Get biggestDiagonal method  
	 * @return the biggestDiagonal's value
	 */
	public double getBiggestDiagonal() {
		return biggestDiagonal;
	}
	
	/**
	 * Set biggestDiagonal method
	 * @param biggestDiagonal
	 */
	public void setBiggestDiagonal(double biggestDiagonal) {
		this.biggestDiagonal = biggestDiagonal;
	}
}

