

public class EX10getLargestWord {
	public static String getLargestWord(String s) {
		String [] word = s.split(" ");
	    String maxlethWord = "";
	    for(int i = 0; i < word.length; i++){
	            if(word[i].length() >= maxlethWord.length()){
	                  maxlethWord = word[i];
	            } 
	    }
	     return maxlethWord;  
		}

}
