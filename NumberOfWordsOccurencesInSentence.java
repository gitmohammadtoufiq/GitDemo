package Coding;
import java.util.*;

public class NumberOfWordsOccurencesInSentence {

	public static void main(String[] args) {

		String s = "I know who am I do you know that";
		Map <String, Integer > map = new HashMap<String, Integer>();
		String [] a = s.split(" ");
		
		for (String b : a) {
			if (map.containsKey(b)) {
				map.put(b, map.get(b)+1); // here map.get(b) returning integer value which is 
			}
			else {
				map.put(b, 1);
			}
		
		}
		
		System.out.println(map);
		
	
}
}











