
class EX1Rect extends EX1Shape {
   double width;
  double height;
  

  public double getWidth() {
	return width;
}


public void setWidth(double width) {
	this.width = width;
}


public double getHeight() {
	return height;
}


public void setHeight(double height) {
	this.height = height;
}


public EX1Rect(double width, double height) {
    // Set the shape name as "Rectangle"
    super("Rectangle");
    this.width = width;
    this.height = height;
  }


public EX1Rect() {
	// TODO Auto-generated constructor stub
}


@Override
float calculateArea() {
	return (float) (width * height);
}

  
}