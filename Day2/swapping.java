package Day2;

import java.util.Scanner;

public class swapping {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int a = s.nextInt();
		int b = s.nextInt();
		//int a=10, b=20;
		a=a+b;
		System.out.println("a valu is:"+a);
		b=a-b;
		System.out.println("b value is:"+b);
		a=a-b;
		System.out.println("a value is"+a);
		System.out.println("\n\nValues after Swapping \nA = " + a + "\nB = " + b);
	}

}
