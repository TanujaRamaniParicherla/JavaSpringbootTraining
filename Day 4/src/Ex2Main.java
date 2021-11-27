import java.util.Scanner;

public class Ex2Main {

	public static void main(String[] args) {
		Ex2MyCalculator my_calculator = new Ex2MyCalculator(); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
          

	}

}
