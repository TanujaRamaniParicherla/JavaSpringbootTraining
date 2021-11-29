
public class Ex3Calculator {
	public static long power(int a,int b) throws Exception{
        int x = a;
        int y = b;
             int z = (int)Math.pow(x,y);
             if(x==0 && y==0)  {
                 throw new Exception("n and p should not be zero.");
             }
             else if(x<0 || y <0) {
             throw new Exception("n or p should not be negative.");
             
             }
             else
             return z;
      
    }

}
