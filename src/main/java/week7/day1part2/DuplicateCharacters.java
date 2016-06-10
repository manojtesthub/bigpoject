package week7.day1part2;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String date = "tes123";
		char[] allChars= date.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		boolean bDuplicate = false;
		for (char c : allChars) {
			
			if(map.containsKey(c)){
				bDuplicate = true;
				System.out.println("has Duplicate characters");
				break;
			}else{
				map.put(c, 1);
			}
		}
		if(!bDuplicate){
			System.out.println("all Unique Characters");
		}
		
		System.out.println(map);
		
		
	}

}
