import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		if ((name.length() % 2) == 0) {

			 System.out.println(name.substring(name.length() / 2 - 1, name.length() / 2 + 1));
		} else {
			System.out.println( name.charAt(name.length() / 2));
		}
	}

}
