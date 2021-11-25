import java.util.Scanner;

public class EX9 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		a = sc.nextInt();
		int r = EX9sumOfSquaresOfEvenDigits.sumOfSquaresOfEvenDigits(a);
		System.out.println("sum of squares of even digits (values) present in the given number. " + r);

	}

}
