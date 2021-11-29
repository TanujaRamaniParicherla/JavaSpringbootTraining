import java.util.Scanner;

public class Ex3 {

    
    public static void main(String[] args) {
    	Ex3Calculator my_calculator = new Ex3Calculator();
    	Scanner in = new Scanner(System.in);
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}