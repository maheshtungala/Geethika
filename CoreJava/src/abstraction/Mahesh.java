package abstraction;
interface Testing{
	public void testing();
	static void hello() {
		System.out.println("Hello everybody there!");
	}
}
interface Selenium extends Testing{
	public void selenium();
}
abstract class Qaplanet{
	abstract void welcome();
}
public class Mahesh extends Qaplanet implements Selenium{
	void welcome() {
		System.out.println("Welcome to Software Testing!");
		
	}
    public void testing() {
    	System.out.println("Mahesh teaches Testing!");
    }
    public void selenium() {
    	System.out.println("Mahesh also teaches Selenium!");
    }
	public static void main(String[] args) {
		 Mahesh m = new Mahesh();
		 Testing.hello();  //calling the static method inside the interface...
		 m.welcome();
		 m.testing();
         m.selenium();
	}

}
