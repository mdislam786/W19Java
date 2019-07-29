package assignments;

import java.util.Scanner;

public class SwapTwoNumbersUsingThirdVariable {

	public static void main(String[] args) {
		int x,y;
		System.out.println("Enter two Integer Numbers for x and y");
		Scanner userInput = new Scanner(System.in);
		x=userInput.nextInt();
		y=userInput.nextInt();
		
		x= x+y; //x=7+8=15
		y=x-y;	//y=15-8=7
		x=x-y;	//x=15-7=8
		
		System.out.println(x+""+y);

	}

}
