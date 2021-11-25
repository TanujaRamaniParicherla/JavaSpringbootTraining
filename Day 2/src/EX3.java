import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int count = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		name = sc.next();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u' || name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I'
					|| name.charAt(i) == 'O' || name.charAt(i) == 'U') {
				count = count + 1;
			}
		}
		System.out.println("number of vowels:" + count);
	}

}
