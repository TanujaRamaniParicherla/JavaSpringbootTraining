import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(
				"C:\\Users\\paricherlatan.raman\\OneDrive - HCL Technologies Ltd\\Documents\\STSPrograms\\sample.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
		String st = br.readLine();
		int count = 0;
		Scanner sc = new Scanner(System.in);
		// String[] str=new String[n];
		System.out.println("Enter number of words");
		int n = sc.nextInt();
		String[] str = new String[n];
		System.out.println("enter words");
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		System.out.println("given string" + st);
		for (String s : str) {

			if (st.contains(s)) {
				count++;
			}
			System.out.println("count of" + s + "is" + count);
		}

	}

}
