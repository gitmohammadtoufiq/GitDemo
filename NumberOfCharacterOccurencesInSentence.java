package Coding;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCharacterOccurencesInSentence {

	public static void main(String[] args) {
		
		String s = "what is your name buddy";
		
		char [] a = s.toCharArray();
		
		HashMap <Character, Integer>map = new HashMap<Character, Integer>();
		
		for (char b : a) {
			if (map.containsKey(b)) {
				map.put(b, map.get(b)+1);
			}
			else {
				map.put(b, 1);
			}
		}
	
	System.out.println(map);	
		
}
}