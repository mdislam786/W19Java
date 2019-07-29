package assignments;

import java.util.Scanner;

public class ReverseGivenString {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter a string to reverse");
		String givenString = userInput.nextLine();
		String reverse = "";
		int length = givenString.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + givenString.charAt(i);

		System.out.println("Reverse of entered string is: " + reverse);
	}
}
