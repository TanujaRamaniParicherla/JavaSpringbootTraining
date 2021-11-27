
public class EX1Circle  extends EX1Shape{
	
	int radius;
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	
	public EX1Circle(int r) {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	float calculateArea() {
		// TODO Auto-generated method stub
		float area=(float) (3.14*radius*radius);
		return area;
	}
	
}
