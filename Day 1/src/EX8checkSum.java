
public class EX8checkSum {
	public static int checkSum(int n)
	{
		int summ=0;

		while(n>0){
	      int remm = n%10;
		if(remm%2!=0){
	        summ = summ+remm;
	      }
	      n = n/10;
	    }
		if(summ%2==0)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}


}
