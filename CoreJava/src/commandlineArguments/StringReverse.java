package commandlineArguments;

public class StringReverse {

	public static void main(String[] args) {
		String input = "qaplanet"; 
		  
        // getBytes() method to convert string  
        // into bytes[]. 
        byte [] strArray = input.getBytes(); 
  
        byte [] result =  
                   new byte [strArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strArray.length; i++) 
            result[i] =  
             strArray[strArray.length-i-1]; 
  
        System.out.println(new String(result)); 

	}

}
