package StringProgram;

import java.util.Scanner;

public class digitsInString {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String sn = "";
		System.out.print("Enter a String : ");
		String str  = s.next();
		int len=str.length();
		for(int i=0 ; i<len ; i++) {
			int asc = str.charAt(i);
			
			if (asc <= 57 && asc >= 48) {
				sn += str.charAt(i);
			}
		}
		System.out.println("\nDigits in the String is : " + sn);
	}
}
