package conditions;

public class Switch {

	public static void main(String[] args) {
		int marks=7;
	
		switch(marks) {
		
		 case 50 :  System.out.println("PASS");
                    break;

         case 60 :  System.out.println("FIRST CLASS");
                    break;
                    
         case 70 :  System.out.println("DISTINCTION");
                    break;
         
         default :  System.out.println("None of the above");
		
	}
	}
}
