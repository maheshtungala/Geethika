package collections;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
        
		list.add(1);
		list.add(2);
		list.add(3);
		 
		list.forEach(System.out::print);

	}

}
