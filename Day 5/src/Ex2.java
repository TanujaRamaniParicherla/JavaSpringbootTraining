import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		 try{
	            Scanner sc = new Scanner(System.in);
	            int a = sc.nextInt();
	           
	            int b = sc.nextInt();
	          
	            int c = a/b;
	            System.out.print(c);
	        }
	        catch(InputMismatchException e){
	            System.out.print("InputMismatchException");
	        }
	        catch(ArithmeticException e)
	        {
	            System.out.print(e);
	        }

	}

}
