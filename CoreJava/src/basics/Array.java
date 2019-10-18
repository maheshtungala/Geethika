package basics;

public class Array {
    int arr[]=new int[3];  //instance array...
    static int arr1[]=new int[2]; 
    {
    	arr[0]=123;
    	arr[1]=1234;
    	arr[2]=1;
    }
    static void hello() {
    	System.out.println("Hello");
    }
	public static void main(String[] args) {
		int a[]=new int[3];  //3 integer array
		
		a[0]=12;
		a[1]=14;
		a[2]=16;
		
		System.out.println(a[2]);
		System.out.println(a.length);
		
		//alternative way to declare an array is...
		
		int a1[]= {1,2,3,4,5};  //array declaration with elements...
		
		System.out.println(a1.length);
        System.out.println(a1[4]);
        
        Array myArray = new Array();
        System.out.println(myArray.arr[2]);
        System.out.println(myArray.arr.length);
        
        //initializing the class/instance array...
       arr1[0]=55;   
       arr1[1]=65;
        
        System.out.println(arr1[1]);
	}

}
