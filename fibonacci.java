package Coding;

public class fibonacci {

	public static void main(String[] args) {

		int first = 0; 
		int second =1; 
		int count; 
		int n =10;
		
		for (int i =0; i<n ; i++) {
			count = first + second;
			System.out.println(count);
			first = second;
			second= count;
			
			
			

	}
	}
}
