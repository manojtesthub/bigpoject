package week7.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a set
		//Set<String> mentors = new HashSet<String>(); Iteration not in order
		//Set<String> mentors = new TreeSet<String>();// Alphabetical order

		Set<String> mentors = new LinkedHashSet<String>();// In exact order

		// Add mentors to the set -- Note the order
		mentors.add("Kader");
		mentors.add("Gopi");
		mentors.add("Vijay");
		mentors.add("Nesa");
		mentors.add("Karim");
		mentors.add("Sakthi");
		
		//Get the count 
		System.out.println("Total mentors : " +mentors.size());
		
		//Try Duplicates not allowed
		mentors.add("Gopi");
		System.out.println("Total mentors : " +mentors.size());
		
		// Print the name of all mentors -- you will notice the order in the list not maintained
		for(String mentor:mentors){
			System.out.println(mentor);
		}
		
		//contains
		System.out.println("Is karim available :" +mentors.contains("Karim"));
		
		//remove
		mentors.remove("Karim");
		System.out.println("Is karim available :" +mentors.contains("Karim"));
		System.out.println("Total mentors : " +mentors.size());
		
		//clear
		mentors.clear();
		
		//check is it empty
		System.out.println("The set is Empty :" +mentors.isEmpty());
		
		
	}

}
