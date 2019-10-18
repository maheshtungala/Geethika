package oops;

public class Student {
	public int rollno;
	public String name;
   public Student(int rollno,String name){
	 this.rollno=rollno;
	 this.name=name;
   }
    public void print() {
	   System.out.println(rollno+" "+name);
   }
	public static void main(String[] args) {
	MyCar m = new MyCar(1900,"B");
	m.year=2000;
	m.model="C";
	
	System.out.println(m);

	}

}
