package Coding;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
		int a[] = {10, 30, 20, 40, 35};
		
		//FOR ASCENDING SORTING
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		//FOR DESCENDING SORTING
		
		Integer b[] = {20, 40, 50, 23, 27};
		
		Arrays.sort(b, Collections.reverseOrder());
		System.out.println(Arrays.toString(b));

	}

}
