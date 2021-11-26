import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		int start,end;
		str=sc.next();
		sc.hasNext();
		start=sc.nextInt();
		end=sc.nextInt();
		System.out.println(str.substring(start, end));

	}

}
