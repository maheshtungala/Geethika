package oops;

public class Calc {
int add(int a,int b) {
	return(a+b);
}
double add(double a,double b) {
	return(a+b);
}
int add(int a,int b,int c) {
	return(a+b+c);
}
public static void main(String[] args) {
		Calc obj = new Calc();
		System.out.println(obj.add(10, 20, 30));

	}

}
