package Day2;

import java.util.Scanner;

public class squareRoot {
	private static Scanner scan;

	public static void main(String args[]) {
		scan = new Scanner(System.in);
		double temp=0;
		System.out.print("Enter a Number : ");
		int n = scan.nextInt();
		double sqrt = n/2;
		while(temp!=sqrt){
			temp = sqrt;
			sqrt = ((n/temp + temp) / 2);
		}
		System.out.println("\nSquare root of " + n + " is : " + sqrt);
	}
}