import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("enter name,teamname,score");
			String details = sc.nextLine();
			Files.write(Paths.get("C:\\\\Users\\\\paricherlatan.raman\\\\OneDrive - HCL Technologies Ltd\\\\Documents\\\\STSPrograms\\\\UserData.txt"), details.getBytes(), StandardOpenOption.APPEND);
			//bw.append(details);
			// bw.write(details);

			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
