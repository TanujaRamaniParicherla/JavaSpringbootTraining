
public class Ex9UserMainCode {
	public String reshape(String str,String k)
	{
		int length = str.length();
		String rev="";
		 
	      for ( int i = length - 1; i >= 0; i-- )
	      {
	    	  rev = rev + str.charAt(i)+k;
	      }
	      return rev;
	        
	}

}
