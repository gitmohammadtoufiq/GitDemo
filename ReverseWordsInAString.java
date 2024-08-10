package Coding;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		
		String s = "welcome to java";
		
		String [] array = s.split(" ");
		String reverseWords = "";
		
		for(String each: array) {
			StringBuilder sb = new StringBuilder(each);
			sb.reverse();
			
			reverseWords = reverseWords + sb.toString() + " ";
		}
		
		System.out.println(reverseWords);
	}

}
