package Day2;

import java.util.Scanner;

public class palindrome {
	private static Scanner s;

	public static void main(String args[]) {
		int rem,temp,sum=0;
		s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		temp = n;
		while(n!=0)
		{
			rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		System.out.println("\nReversed Number is : " + sum);
		if(sum == temp)
			System.out.println("\nYes... " +temp + " is a Palindrome");
		else
			System.out.println("\nNo... " + temp + " is not a Palindrome");
	}
}
