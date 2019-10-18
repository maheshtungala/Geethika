package oops;
interface Testing{
	public static void hello() {
		System.out.println("Hello everybody!");
	}
	
	public void testing();
}
interface Selenium extends Testing {
	public void selenium();
}
abstract class Qaplanet{
	abstract public void welcome();
}
public class Mahesh extends Qaplanet implements Selenium{
	public void welcome() {
		System.out.println("Welcome to Qaplanet!");
	}
    public void testing() {
    	System.out.println("Mahesh teaches Testing!");
    }
    public void selenium() {
    	System.out.println("Mahesh also teaches Selenium!");
    }
	public static void main(String[] args) {
		Mahesh m = new Mahesh();
		//Testing t = new Mahesh();
	   //t.testing();
		Testing.hello();
		m.welcome();
		m.testing();
		m.selenium();

	}

}
