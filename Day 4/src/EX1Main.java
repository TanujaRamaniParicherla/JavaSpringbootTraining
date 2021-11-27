import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		List<String> li = new ArrayList<String>();
		li.add("Circle");
		li.add("square");
		li.add("Rectangle");
		System.out.println(li);
		System.out.println("Enter name of shape:");
		String str = sc.next();
		sc.nextLine();
		switch(str)
		{
		case "Circle":
			System.out.println("Circle");
			System.out.println("enter radius");
			int r = sc.nextInt();
			EX1Circle circle1 = new EX1Circle(r);
			circle1.setRadius(r);
			System.out.println(circle1.calculateArea());
			break;
		case "square":
			System.out.println("square");
			int r1 = sc.nextInt();
			EX1Square square = new EX1Square();
			square.setSquare(r1);
			System.out.println(square.calculateArea());
			break;
		case "Rectangle":
			System.out.println("rectangle");
			System.out.println("enter length");
			int r3 = sc.nextInt();
			System.out.println("enter breadth");
			int r2 = sc.nextInt();
			EX1Rect rectangle = new EX1Rect(r3, r2);
			rectangle.setHeight(r3);
			rectangle.setWidth(r2);
			System.out.println(rectangle.calculateArea());
		}
	}

}
