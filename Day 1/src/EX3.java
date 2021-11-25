import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		int a, b, c;
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value:");
		a = sc.nextInt();
		System.out.println("enter b value:");
		b = sc.nextInt();
		System.out.println("enter c value:");
		c = sc.nextInt();
		avg=(a + b + c) / 3;
		System.out.println(avg);

	}

}
