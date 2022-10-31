package Day9;

import java.util.Scanner;

public class swapString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("String 1 : ");
		String a=s.nextLine();
		System.out.print("String 2 : ");
		String b=s.nextLine();
		int al=a.length();
		int bl=b.length();
		a+=b;
		b=a.substring(0,al);
		a=a.substring((al) , (al+bl));
		System.out.println("\nAfter Swapping :\n"+a+"\n"+b);
		s.close();
	}

}
