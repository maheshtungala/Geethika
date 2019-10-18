package collections;
import java.util.*;
public class Student {
    int rollno;
    String name;
    Student(int rollno,String name){
    	this.rollno=rollno;
    	this.name=name;
    }
    public String toString() {
    	return rollno+" "+name;
    }
	public static void main(String[] args) {
       Student s1=new Student(1111,"Mahesh");
       Student s2=new Student(2222,"Rajesh");
       
       ArrayList<Student> s = new ArrayList<Student>();
       s.add(s1);
       s.add(s2);
       Iterator itr = s.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
	}
}
