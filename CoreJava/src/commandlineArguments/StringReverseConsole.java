package commandlineArguments;
import java.util.Scanner;
public class StringReverseConsole {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter a String ");
		String input = console.next();

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
  
        System.out.println("The reverse of the String is :" + new String(result));
	}

}
