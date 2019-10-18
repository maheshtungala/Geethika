package basics;
public class Dog {
    String name;
    Dog(String name){   //constructor
    	this.name=name;
    }
    void bark() {      //method
    	System.out.println(name +" says wow..");
    }
	public static void main(String[] args) {
		Dog d1=new Dog("Rambo"),
				d2=new Dog("Scooby"),
				  d3=new Dog("Whoopy");
		
		//declare a Dog array....
		Dog dArray[]=new Dog[3];
		
		//put the dogs into the array...
		dArray[0]=d1;
		dArray[1]=d2;
		dArray[2]=d3;
		
       //tell all the dogs to bark...using for loop..
	/*	for(int i=0;i<dArray.length;i++) {
			dArray[i].bark();
		}  */
		
	  //tell all the dogs to bark ...using for each loop..
		for(Dog d:dArray) {
			d.bark();
		}
	}

}
