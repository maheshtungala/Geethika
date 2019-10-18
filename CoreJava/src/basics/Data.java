package basics;

public class Data {
    boolean i;  //instance variable
    void print() {
    	int l;
    	//System.out.println(l);
    }
	public static void main(String[] args) {
		Data d=new Data();
		System.out.println(d.i);
           // int l;
           // System.out.println(l);
		int i=100;
		//byte b=10;
		//i=b;
		//b=i;
		
		System.out.println((char)i);
		
		char c='A';
		System.out.println((int)c);
		
		char z=(char)i;  //allowed...
		System.out.println(z);
	}

}
