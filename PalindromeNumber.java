package Coding;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Integer num=121; 
		String s = num.toString();
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		//System.out.println(sb);
		
		String rev = sb.toString();
		
		//System.out.println(rev);
		
		if (s.equals(rev)) {
			System.out.print("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
