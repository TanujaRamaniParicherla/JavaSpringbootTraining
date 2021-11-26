import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter string :");
		str=sc.next();
		Ex8UserMainCode code=new Ex8UserMainCode();
		System.out.println(code.getString(str));

	}

}
