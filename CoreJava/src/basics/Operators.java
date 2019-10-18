package basics;

public class Operators {

	public static void main(String[] args) {
		//int temp=-23;
			//System.out.println(-temp);
			int a=6;
			int b=++a;
			System.out.println(b);
			System.out.println(a++);
			System.out.println(a);
			int c=b--;
			System.out.println(c);
			int d=a++ + --b - --c;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);

	}

}
