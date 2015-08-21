package geometricShapes;

public class Trapezium extends AbstractQuadrilateral{
    private double biggestSide;
    private double smallestSide;
    
    public Trapezium(double side, double height, double biggestSide, double smallestSide) {
		super(side, height);	
		setBiggestSide(biggestSide);
		setSmallestSide(smallestSide);
	}	

	public double perimeter() throws Exception{
		if(biggestSide <= 0 || smallestSide <= 0)
			throw new Exception("Wrong value Typed. Should be greater than 0!");	
		else
			return 2*side + biggestSide + smallestSide;
	}
		
	public double area()throws Exception{
		if(biggestSide <= 0 || smallestSide <= 0)
			throw new Exception("Wrong value Typed. Should be greater than 0!");	
		else
	return ((biggestSide + smallestSide)*height)/2;
	}
	 
	public double getBiggestSide() {
		return biggestSide;
	}

	public double getSmallestSide() {
		return smallestSide;
	}

	public void setBiggestSide(double biggestSide) {
		this.biggestSide = biggestSide;
	}

	public void setSmallestSide(double smallestSide) {
		this.smallestSide = smallestSide;
	}
}
