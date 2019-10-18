package basics;

public class Static {
    
    void print() {   //instance method..
    	s=s*2;  //forwarding reference
    	System.out.println("Printing from print method " +s);  //accessing the static variable...
    }
    
    static int s=100;  //static variable..
	public static void main(String[] args) {
		System.out.println(s);
		int s=25;  //local variable...
		Static st=new Static();
	   System.out.println("Accessing the static variable "+ st.s);
		
		st.print();
		
       System.out.println("Accessing the static variable "+ st.s);	
       st.s=st.s*2;
       st.print();
       
       System.out.println("Accessing the static variable "+ st.s);
	}
}
