public class EX1Square extends EX1Shape {

	int square;
	

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	public EX1Square(String name, int square) {
		super(name);
		this.square = square;
	}

	public EX1Square() {
		// TODO Auto-generated constructor stub
	}

	@Override
	float calculateArea() {
		// TODO Auto-generated method stub
		float area = square * square;
		return area;
	}

}