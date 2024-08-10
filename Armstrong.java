package Coding;

public class Armstrong {

	public static void main(String[] args) {
		int num= 154; 
		int temp=num; 
		double sum = 0; 
		int rem; 
		
		while (temp!=0) {
			rem = temp%10; 
			sum = sum + rem * rem * rem; 
			temp = temp/10; 
		}
		if (num ==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
	}

}
