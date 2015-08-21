package geometricShapes;

public class Square extends AbstractQuadrilateral{
	
	
	/**
	 * @param side
	 * @param height
	 */
	protected Square(double side, double height) {
		super(side, height);
	}

	public double perimeter() throws Exception{
		if(side <= 0 || height <= 0)
			throw new Exception("Wrong value Typed. Should be greater than 0!");
		else
		return 2*side+2*height;
	}
	
	public double area()throws Exception{
		if(side <= 0 || height <= 0)
			throw new Exception("Wrong value Typed. Should be greater than 0!");
		else
		return Math.pow(side,2);
	}
	
}
