
public class EX7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i+"fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println(i+"buzz");
            } else if (i % 3 == 0) {
                System.out.println(i+"fizz");
            } 
        }
        
    }
	}


