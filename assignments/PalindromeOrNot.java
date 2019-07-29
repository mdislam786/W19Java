package assignments;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter a string to check");

		String userString = userInput.nextLine();

		String reverseString = "";

		int length = userString.length();

		for (int i = length - 1; i >= 0; i--)
			reverseString = reverseString + userString.charAt(i);

		if (userString.equalsIgnoreCase(reverseString)) {
			System.out.println("Given String is: Palindrome");
		} else {
			System.out.println("Given String is: Not  Palindrome!");
		}
	}

}
