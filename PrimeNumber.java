package Coding;

public class PrimeNumber {

    public static void main(String[] args) {

        int a = 10;
        boolean c = true; // Assume it's prime

        for (int i = 2; i <a; i++) { // Check divisibility only up to a/2
            if (a % i == 0) {
                c = false; // Found a divisor, so it's not prime
                break;     // Exit the loop early
            }
        }

        if (c) {
            System.out.println(a + " is prime");
        } else {
            System.out.println(a + " is not prime");
        }

    }
}