package Day2;

import java.util.Scanner;

public class gcdOfTwoNumbers {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int ans=0;
		System.out.print("Enter two Numbers : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		for (int i=2 ; i<a&&i<b ; i++) {
			if(a%i==0 && b%i==0) {
				ans=i;
			}
		}
		System.out.println("\nGCD of two Numbers is : " + ans);
	}
}
