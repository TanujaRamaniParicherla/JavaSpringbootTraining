import java.util.Scanner;

public class Ex4 {
	private String name;
	   private int age;
	   

	public Ex4(String name, int age) throws Ex4CustomException {
		if(age<19) {
	         String msg = "CustomException: InvalidAgeRangeException";
	        Ex4CustomException exName = new Ex4CustomException(msg);
	         throw exName;
	      }
		this.name = name;
		this.age = age;
	}
	public void display()
	{
		System.out.println("Name of the Student: "+this.name );
	      System.out.println("Age of the Student: "+this.age );
	}


	public static void main(String[] args) throws Ex4CustomException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	      System.out.println("Enter the name : ");
	      String name = sc.next();
	      System.out.println("Enter the age : ");
	      int age = sc.nextInt();
	      Ex4 ex = new Ex4(name, age);
	      ex.display();

	}

}
