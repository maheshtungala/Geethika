package strings;

public class StringDeclaration {

	public static void main(String[] args) {
		String s1="mahesh";
		System.out.println(s1);
		
		String s2=new String("mahesh");
		System.out.println(s2);
		
		char a[]= {'m','a','h','e','s','h'};
		
		String s3= new String(a);
		System.out.println(s3);
		
		System.out.println(s1.length());

	}

}
