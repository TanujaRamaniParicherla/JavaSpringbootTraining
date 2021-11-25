import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, e, f;
		EX6Addition add=new EX6Addition();
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();
		System.out.println("sum is:" + add.sum(a, b));
		System.out.println(add.sum(a, b, c));
		System.out.println(add.sum(a, b, c, d));
		System.out.println(add.sum(a, b, c, d, e));
		System.out.println(add.sum(a, b, c, d, e, f));
	}

}
