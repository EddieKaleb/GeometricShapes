package geometricShapes;

public class Square extends AbstractQuadrilateral{
	
	public Square(double side, double height){
		super(side, height);
	}
	
	public double perimeter(){
		return 4*side;
	}
	
	public double area(){
		return Math.pow(side,2);
	}
	
}
