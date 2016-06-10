package week7.day1part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// You can't use primitive types
		//Map<Integer, String>  mentors = new LinkedHashMap<>();
		Map<Integer, String>  mentors = new HashMap<>(); 
		//Map<Integer, String>  mentors = new TreeMap<>(); //keys sorted natural order

		// Add mentors to the map (note the order)
		mentors.put(5,"Karim"); // A map cannot contain duplicate keys;
		mentors.put(6,"Sakthi");
		mentors.put(4,"Rajaram");
		mentors.put(1,"Babu");
		mentors.put(3,"Vijay");
		mentors.put(2,"Saravanan");
		
		mentors.put(null,null);
		mentors.put(7,"Sakthi");
		//mentors.put(7,"Nesa");
		
		// Now get the count
		System.out.println("The total mentors are"
					+ " :"+mentors.size());
		
		// find the value of 4
		System.out.println("The value of 4 is :"+mentors.get(4));
		
			for (Entry<Integer, String> mentor : mentors.entrySet()) {
			
			System.out.println("The key is: "+mentor.getKey()+""
					+ " and value is: "+mentor.getValue());	
		}

			//contains
			System.out.println(mentors.containsKey(7));
			
			// remove
			mentors.remove(7);
			
			// contains
			System.out.println("Is key:5 is available in"
					+ " the set after removal :"+mentors.containsKey(7));
			// clear
			mentors.clear();
			
			// check if it empty
			System.out.println("The set is empty "
					+ ":"+mentors.isEmpty());
	
	}

}
