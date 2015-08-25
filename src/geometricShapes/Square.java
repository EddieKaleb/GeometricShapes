package geometricShapes;

public class Square extends AbstractQuadrilateral{
	
	
	/**
	 * @param side
	 */
	protected Square(double side) {
		super(side, side);
	}

	public double perimeter() throws Exception{
		if(side <= 0)
			throw new Exception("Wrong value Typed. Should be greater than 0!");
		else
		return 4*side;
	}
	
	public double area()throws Exception{
		if(side <= 0)
			throw new Exception("Wrong value Typed. Should be greater than 0!");
		else
		return Math.pow(side,2);
	}
	
}
