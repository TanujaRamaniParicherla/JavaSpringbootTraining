import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		try {
			int a = in.nextInt();
			int b = in.nextInt();
			int z = a / b;
			System.out.println(z);
		} catch (ArithmeticException | NumberFormatException ae) {
			System.out.println(ae.getMessage());
		}

	}
}
