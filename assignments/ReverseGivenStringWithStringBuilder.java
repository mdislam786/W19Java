package assignments;

import java.util.Scanner;

public class ReverseGivenStringWithStringBuilder {

	public static void main(String[] args) {

		System.out.println("Enter string to reverse:");

		Scanner read = new Scanner(System.in);
		String str = read.nextLine();

		StringBuilder sb = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}

		System.out.println("Reversed string is: " + sb.toString());
		//System.out.println(sb.toString());
	}

}
