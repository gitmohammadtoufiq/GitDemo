package Coding;

public class EvenOddNumFromArray {

	public static void main(String[] args) {
		
		int a [] = {1, 2, 3, 5, 6, 7, 1000};
		
		for (int i =0 ; i<a.length; i++) {
			if (a[i]%2==1) {
				System.out.println(a[i] + " is odd");
			}
			else {
				System.out.println(a[i] +" is even");
			}
		}

	}

}
