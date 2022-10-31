package Day1;

import java.util.*;

public class factorial {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int fact = 1;
		System.out.print("Enter a Number : ");
		int n = s.nextInt();
		for (int i = 1 ; i <= n ; i++)
		{
			fact *= i;
		}
		System.out.println("\nFactorial of the given Number is : " + fact);
	}

}
