package tictactoe2;

import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {
		int n;
		Scanner keyboard = new Scanner(System.in);
		System.out.println( "Enter How many numbers to sum");
		n = keyboard.nextInt();
				System.out.print(" the sum of" + n + (n*(1+n)/2));
	}

}
