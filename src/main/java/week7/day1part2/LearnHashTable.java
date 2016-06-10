package week7.day1part2;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class LearnHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// You can't use primitive types as generic arguments in Java
		Map<Integer, String>  mentors = new Hashtable<>();
		
		// Add mentors to the map (note the order)
		//synchronized (hence thread-safe in multi threading)
		mentors.put(5,"Karim");
		
		mentors.put(3,"Vijay");
		mentors.put(2,"Kader");
		mentors.put(4,"Gopi");
		mentors.put(1,"Nesa");
		mentors.put(6,"Sakthi");
		//mentors.put(null,null);  //no null values allowed

		// Now get the count
		System.out.println("The total mentors are :"+mentors.size());
		
		// find the value of 4
		System.out.println("The value of 4 is :"+mentors.get(4));
		
		// Print the name of all mentors
		for(Entry<Integer, String> mentor : mentors.entrySet()){
			System.out.println("The Key : "+mentor.getKey()+" and Value : "+mentor.getValue());
			
		}
		
		// contains
				System.out.println("Is key:5 is available in the set "
						+ ":"+mentors.containsKey(5));

				// remove
				mentors.remove(5);
				
				// contains
				System.out.println("Is key:5 is available in the set after "
						+ "removal :"+mentors.containsKey(5));
						
				// clear
				mentors.clear();
				
				// check if it empty
				System.out.println("The set is empty :"
						+ ""+mentors.isEmpty());
		
	}

}
