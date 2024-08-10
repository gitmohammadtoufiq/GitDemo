package Coding;

import java.util.Arrays;

public class FindIfTwoGivenStringsAreAnagram {

	public static void main(String[] args) {

		String s1= "Sile nt"; // should remove this white spaces
		String s2= "Listen";
		
		String  s3 = s1.replaceAll("\\s",  ""); 
		String s4 = s2.replaceAll("\\s", "");
		
		char [] array1 = s3.toLowerCase().toCharArray();
		char [] array2 = s4.toLowerCase().toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(Arrays.equals(array1, array2)) {
			System.out.print("Strings are anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		

	}

}
