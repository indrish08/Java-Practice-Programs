package Day2;

import java.util.Scanner;

public class addDigits {
	private static Scanner s;

	public static void main(String[] args) {
		int rem,sum=0;
		s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
			while(n > 0){
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
			}
		System.out.println("\nSum of digit is : " + sum);
	}
}