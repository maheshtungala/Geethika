package commandlineArguments;
import java.util.Scanner;
public class ConsoleInput1 {

public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("Enter a number " );
		 int x=s.nextInt();
		 
		 System.out.println("You have entered "+x);

		 System.out.println("The square of the number is "+ (x*x));
		 
		 System.out.println("The square root of the number is " + Math.sqrt(x));
	}

}
