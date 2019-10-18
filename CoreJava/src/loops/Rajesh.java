package loops;
import oops.*;
public class Rajesh extends Mahesh implements Qap {
   public void hai() {
	   System.out.println("hai");
   }
	public static void main(String[] args) {
		Rajesh r = new Rajesh();
	    Qap.hello();
	    r.hai();
		r.welcome();
		r.testing();
		r.selenium();

	}

}
