package basics;

public class Variable2 {
	 void print() {    //instance method
		 int local=25; //local variable
		  System.out.println("Local variable from print method " + local); 
		  System.out.println("Printing the instance variable thru print method " +x); //object is not needed here...
	   }
	public static void main(String[] args) {
		int local=10;
		System.out.println("Local variable from the main method " + local);
        Variable2 v=new Variable2();
        v.print();
        System.out.println("Printing the instance variabel in the main method " +v.x);
	}
  int x=25; //instance variable....
}
