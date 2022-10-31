package Day1;

import java.util.*; 

public class fibonacci {

	private static Scanner sc;

	public static void main(String[] args) {
		int a = 0, b = 1, c = 0, n;	
		System.out.print("Enter a Number : ");
		sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print(a + " " + b);
		while(n-2 != 0)
		{
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
			n--;
		}

	}

}
