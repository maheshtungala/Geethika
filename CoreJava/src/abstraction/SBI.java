package abstraction;
abstract class Amazon{
	static void welcome() {
		System.out.println("Welcome to Amazon!");
	}
	abstract void pay();
}
class Axis extends Amazon{
	void pay() {
		   System.out.println("Paying the amount 1275.45");
	   }
}
public class SBI extends Amazon {
   void pay() {
	   System.out.println("Paying the amount 1275.45");
   }
	public static void main(String[] args) {
		Amazon s = new SBI();   //reference object
		Amazon a = new Axis();  //reference object
		welcome();
		a.pay();
		s.pay();

	}

}
