
public class EX9sumOfSquaresOfEvenDigits {
	public static int sumOfSquaresOfEvenDigits(int n)
	{
		int n1,square = 0;
		while(n!=0)
	    {
	    n1 = n%10;
	    if((n1%2)==0)
	    {
	    	square+=(n1*n1);
	    }
	    n/=10;
	    }
		return square;
	}

}
