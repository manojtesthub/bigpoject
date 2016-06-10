package week7.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//size, get(index), add, remove, clear, isEmpty
		// Create a List
		List<String> mentors = new ArrayList<String>();

		// Add mentors to the set -- Note the order
		mentors.add("Kader");
		mentors.add("gopi");
		mentors.add("Nesa");
		mentors.add("Bharath");
		mentors.add("Karim");
		mentors.add("sakthi");
		
		//GetDuplicateCount in a List

		String checkduplicates = "kader";
		int i =0;
		for (String mentor : mentors){
			if(mentor.equals(checkduplicates)){
				i++;
			}
		}
		System.out.println(i);
		
		//get the count
		System.out.println("Total mentors : " +mentors.size());
		
		//Allows duplicates
		mentors.add("Nesa");
		System.out.println("Total mentors : " +mentors.size());
		
		//print alll the mentors
		for(String mentor : mentors){
			System.out.println(mentor);
		}

		// contains
				System.out.println("Is karim is available "
						+ "in the set :"+mentors.contains("Karim"));
	//remove
				mentors.remove("karim");
	
				System.out.println("Is Karim is available "
						+ "in the set :"+mentors.contains("karim"));
				
				// clear
				mentors.clear();
				// check if it empty
				System.out.println("The set is empty :"
						+ ""+mentors.isEmpty());
				
				
	}

}
