package geometricShapes;

public abstract class AbstractQuadrilateral implements ShapeIF {
	protected double side;
	protected double height;


	
	public double perimeter(){
		return (2 * side)  + (2 * height);
	}
	
	public double area(){
		return side * height;
	}

	protected double getSide() {
		return side;
	}

	protected double getHeight() {
		return height;
	}

	protected void setSide(double side) {
		this.side = side;
	}

	protected void setHeight(double height) {
		this.height = height;
	}

	

	public AbstractQuadrilateral(double side, double height) {
		setSide(side);
		setHeight(height);
	}
	
}
