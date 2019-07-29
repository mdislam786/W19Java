package assignments;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {

		int remainder;
		boolean isPrime = true;
		System.out.println("Give me a Integer Number");
		Scanner scan = new Scanner(System.in);
		int userGivenNumber = scan.nextInt(); // Enter the numberToCheckber you want to check for prime

		// Loop to check whether the numberToCheck is divisible any numberToCheck
		// other than 1 and itself
		for (int i = 2; i <= userGivenNumber / 2; i++) {			
			remainder = userGivenNumber % i;	

			// if remainder is 0 than userGivenNumber is not prime and break loop. else
			// continue loop
			if (remainder == 0) {
				isPrime = false;
				break;
			}
		}
		// Check value true or false,if isPrime is true then userGivenNumber is prime
		// otherwise not prime
		if (isPrime)
			System.out.println(userGivenNumber + " is a Prime number");
		else
			System.out.println(userGivenNumber + " is not a Prime number");

	}

}
