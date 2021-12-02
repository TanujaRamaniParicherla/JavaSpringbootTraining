import java.io.BufferedReader;
import java.io.LineNumberReader;
import java.io.LineNumberReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
        String strLine = "";
        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("C:\\\\Users\\\\paricherlatan.raman\\\\OneDrive - HCL Technologies Ltd\\\\Documents\\\\STSPrograms\\\\FNFE.txt")));
             while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3){
                System.out.println(strLine);
            }
           reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }

	}


