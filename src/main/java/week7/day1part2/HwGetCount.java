package week7.day1part2;

import java.util.LinkedHashMap;
import java.util.Map;

public class HwGetCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String date = "amazon";
		char[] allchars = date.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(char c : allchars){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c, 1);
			}
		}

		System.out.println(map);
		
		}

	}


