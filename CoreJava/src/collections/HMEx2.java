package collections;
import java.util.*;
public class HMEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Mahesh",100);
		map.put("Ravi",200);
		map.put("Mahesh",500);
		
		
		System.out.println(map);
		/*for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
		
	}

}
