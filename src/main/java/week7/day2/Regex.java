package week7.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pattern = "[a-zA-Z0-9]+.[a-zA-Z]+@[a-zA-Z]+.[a-z]{3,5}";
		
		//String pattern = "[w][d]+.[a-zA-Z]+@[a-zA-Z]+.[a-z]{3,5}";

		Pattern p = Pattern.compile(pattern);
		
		Matcher match = p.matcher("babum1.m@testleaf.com");
		System.out.println(match.matches());
	}

}
