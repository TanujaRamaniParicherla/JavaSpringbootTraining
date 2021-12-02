import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 InputStreamReader r=new InputStreamReader(System.in);    
		    BufferedReader br=new BufferedReader(r);            
		    System.out.println("Enter your name");    
		    String name=br.readLine();    
		    System.out.println(name);    
	}

}
