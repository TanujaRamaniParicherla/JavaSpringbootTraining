import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\paricherlatan.raman\\OneDrive - HCL Technologies Ltd\\Documents\\STSPrograms\\FNFE.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null)

			// Print the string
			System.out.println(st);

	}

}
