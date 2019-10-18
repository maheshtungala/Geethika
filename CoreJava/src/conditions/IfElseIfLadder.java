package conditions;

public class IfElseIfLadder {

	public static void main(String[] args) {
		int marks=49;
		
		if(marks>=40 && marks<50) {
			System.out.println("PASS");
		}else if(marks>=50 && marks<60) {
			System.out.println("SECOND CLASS");
		}else if(marks>=60 && marks<70) {
			System.out.println("FIRST CLASS");
		}else if(marks>=70 && marks<=100) {
			System.out.println("DISTINCTION");
		}
		else {
			System.out.println("Invalid or failed!");
		}
	}
}
