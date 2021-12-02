import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class Ex3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data="tanuja 1 dec program";
		//File file = new File(
			//	"C:\\Users\\paricherlatan.raman\\OneDrive - HCL Technologies Ltd\\Documents\\STSPrograms\\FNFE.txt");

		//FileWriter fw=new FileWriter(file);
		Files.write(Paths.get("C:\\\\Users\\\\paricherlatan.raman\\\\OneDrive - HCL Technologies Ltd\\\\Documents\\\\STSPrograms\\\\FNFE.txt"), data.getBytes(), StandardOpenOption.APPEND);
		//fw.write(data);
		System.out.println("done");
		
	
	}

}
