package word_reverse;

public class string_reverse {
	public string_reverse() {
		return;
	}
	
	public static String rev(String input) {
        byte [] strAsByteArray = input.getBytes(); 
        byte [] result = new byte [strAsByteArray.length]; 
        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i] =  
             strAsByteArray[strAsByteArray.length-i-1]; 
  
        return new String(result); 
	}
}
