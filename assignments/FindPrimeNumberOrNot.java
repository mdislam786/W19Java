package assignments;

import java.util.Scanner;

public class FindPrimeNumberOrNot {

	public static void main(String[] args) {

		boolean isPrime = true;

		System.out.println("Provide a number");

		Scanner userInput = new Scanner(System.in);

		int numberToBeChecked = userInput.nextInt(); // Enter the numberToCheckber you want to check for prime other than 1
													// and itself

		// Loop to check whether the numberToCheck is divisible any numberToCheck
		// other than 1 and itself.
		int remainder;
		for (int i = 2; i < numberToBeChecked / 2; i++) {
			remainder = numberToBeChecked % i; // % stands for Modulus which means remainder.
			if (remainder == 0) {
				isPrime = false;
				break;
			}
		}
		// Check value true or false,if isPrime is true then numberToBeChecked is prime
		// otherwise not prime
		if (isPrime) {
			System.out.println("Provided number is Prime");
		} else {
			System.out.println("Provided number is not a Prime");
		}
	}
}
