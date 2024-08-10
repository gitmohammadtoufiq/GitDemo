package Coding;

import java.util.Arrays;

public class SearchForAGivenElementInArray {
	public static void main(String [] args) {
		
		int a[] = {1, 2, 3, 5};
		
		int Element =2;
		Arrays.sort(a);
		Arrays.toString(a);
		
		for (int i =1; i<= a.length ; i++) {
		
		
		if (Element == a[i]) {
			System.out.println(Element + ": is present");
			break;
		}
		else {
			System.out.println("not found");
			break;
		}
		
	}
}
}
