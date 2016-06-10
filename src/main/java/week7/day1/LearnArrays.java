package week7.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// It is 6 sized array supports only String
		String[] mentors = new String[6];
		mentors[0] = "kader";
		mentors[1] = "nesa";
		mentors[2] = "gopi";
		mentors[3] = "vijay";
		mentors[4] = "karim";
		mentors[5] = "shakthi"; // if not assigned ; so default value is null
		
		System.out.println(mentors.length);
		System.out.println(mentors[1]);
		System.out.println(mentors[5]);
		//System.out.println(mentors[6]); // accessing beyond size, throws exception

//		Array sort for string throw error
		Arrays.sort(mentors);
		System.out.println("After Sorting: "+mentors[0]);
		System.out.println(mentors[5]);
		System.out.println(mentors[1]);
		System.out.println(mentors[2]);
		System.out.println(mentors[5]);

		// Filling an array to place a specific value at each index
		Arrays.fill(mentors, "Babu");
		System.out.println(mentors[5]);
		
		// Another way of creating
				int[] weeks = {1,2,3,4,5,6,11,7,9};
				System.out.println("int array "+weeks[0]);

				// Searching for a mentor
				System.out.println("The index of 4 is Searching for a mentor"
						+ " :"+Arrays.binarySearch(weeks, 4));
				// binarySearch not applicable to String but can be used for character

				int[] anotherWeek = weeks.clone();
				System.out.println(anotherWeek[4]);
				
				anotherWeek[2]=23;
				// Compare 2 arrays
				System.out.println("The comparison of the 2 int arrays are:"
						+ " clone : "+Arrays.equals(weeks, anotherWeek));


				
				//System.out.println(sort.toString());

	
	}

}
