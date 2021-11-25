import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		int a, b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value:");
		a = sc.nextInt();
		System.out.println("enter b value:");
		b = sc.nextInt();
		System.out.println("before swapping:"+a+"\t"+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping:"+a+"\t"+b);
		
	}

}
