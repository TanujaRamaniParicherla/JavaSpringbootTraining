import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileInputStream fr=new FileInputStream("C:\\Users\\paricherlatan.raman\\OneDrive - HCL Technologies Ltd\\Documents\\STSPrograms\\FNFE.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fr));
			  String line;
			  while((line=br.readLine())!=null){
			    System.out.println(line);
			  }
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("file not found");
			fe.printStackTrace();
		}
	}

}
