package geometricShapes;

public class Lozenge extends AbstractQuadrilateral {
	
	private double diagonal;
	
	
	public Lozenge(double side, double height, double diagonal) {
		super(side, height);
		setDiagonal(diagonal);
	}
	
	public double perimeter(){
		return 4*side;
	}
	
	public double area(){
		return (height * diagonal)/2;
	}
	
	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}
}
