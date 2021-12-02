
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ex5 {
	public static void main(String[] args) throws FileNotFoundException {
		String longest_word = "";
		String current;
		Scanner sc = new Scanner(new File("C:\\\\Users\\\\paricherlatan.raman\\\\OneDrive - HCL Technologies Ltd\\\\Documents\\\\STSPrograms\\\\FNFE.txt"));

		while (sc.hasNext()) {
			current = sc.next();
			if (current.length() > longest_word.length()) {
				longest_word = current;
			}

		}
		System.out.println("\n" + longest_word + "\n");

	}
}
