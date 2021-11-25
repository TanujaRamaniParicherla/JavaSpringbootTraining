import java.util.Scanner;
public class EX8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		a=sc.nextInt();
		int r=EX8checkSum.checkSum(a);
		if(r==1)
		{
			System.out.println("sum of odd digits are odd");

		}
		else
		{
			System.out.println("sum of odd digits are even");
		}

	}

}
