package Coding;

public class MaxAndMinElementInArray {
	public static void main(String[] args) {

		// find max
		int[] a = { 10, 20, 30, 50 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("max is :"+max);

		// find min
		int[] b = { 60, 20, 30, 50 };
		int min = b[0];

		for (int i = 1; i < b.length; i++) {
			if (b[i] < min) {
				min = b[i];
			}
		}

		System.out.println("min is :" +min);

	}

}
