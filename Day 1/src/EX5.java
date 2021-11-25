import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
		int a;
		String flag = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		a = sc.nextInt();
		for (int i = 2; i <= a / i; ++i) {
			if (a % i == 0) {
				flag = "false";
				System.out.println("Not prime");
				break;
			}
		}
		if(flag!="false")	
		{
			System.out.println("prime");
		}
	}

}
