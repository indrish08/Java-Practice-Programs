package Day7;

import java.util.*;

public class negToPos {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		if(n < 0)
		{
			n = n * (-1);
			System.out.println("\nPositive Number : " + n);
		}else {
			System.out.println("\nThe given number "+n+" is already a Positive number");
		}
	}
}
