package collections;
import java.util.Map;
import java.util.HashMap;
public class HMEx1 {
	public static void print(Map<String, Integer> map)  
    { 
        if (map.isEmpty())  
        { 
            System.out.println("map is empty"); 
        } 
          
        else
        { 
            System.out.println(map); 
        } 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   HashMap<String, Integer> map = new HashMap<>(); 
	          
	        print(map); 
	        map.put("vishal", 10); 
	        map.put("sachin", 30); 
	        map.put("vaibhav", 20); 
	          
	        System.out.println("Size of map is:- " + map.size()); 
	      
	        print(map); 
	        if (map.containsKey("vishal"))  
	        { 
	            Integer a = map.get("vishal"); 
	            System.out.println("value for key \"vishal\" is:- " + a); 
	        } 
	          
	        map.clear(); 
	        print(map); 
	        
  } 
}


