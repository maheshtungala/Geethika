package oops;
abstract class Amazon{
	static void welcome() {
		System.out.println("Welcome to Amazon, the world's shopping mall!");
	}
	abstract void pay();
}
class Axis extends Amazon{
	void pay() {
		System.out.println("Payment successful for the amount 1275");
	}
}
public class SBI extends Amazon{
	void pay() {
		System.out.println("Payment successful for the amount 1275");
	}
	public static void main(String[] args) {
		
		Amazon s = new SBI();
		welcome();
        s.pay();
        Amazon a = new Axis();
        a.pay();
	}

}
