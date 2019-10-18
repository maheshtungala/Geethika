package basics;

public class Assignments {

	public static void main(String[] args) {
		int x=5,y=5,z=5;
		x=y+z;
		System.out.println(x);  //prints 10
     	z=x+y;
		System.out.println(z);  //prints 15

		//int a=b=c=d;  //nested while declaration..
		int a,b,c,d;
		a=b=c=d=5;    //nested after declaration..
		
		System.out.println(a+=b); //prints 10..
		System.out.println(a+=1); //prints?  
		
	}

}
