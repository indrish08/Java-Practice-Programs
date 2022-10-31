package Day3;

import java.util.Scanner;

public class smallCapsNum {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String sl = "";
		String ss = "";
		String sn = "";
		String sc = "";
		System.out.print("Enter a String : ");
		String str  = s.next();
		int len=str.length();
		for(int i=0 ; i<len ; i++) {
			int asc = str.charAt(i);
			if (asc <= 122 && asc >= 97) {
				sl += str.charAt(i);
			}
			else if (asc <= 57 && asc >= 48) {
				sn += str.charAt(i);
			}
			else if (asc <= 90 && asc >= 65) {
				sc += str.charAt(i);
			}
			else {
				ss += str.charAt(i);				
			}
		}
		System.out.println(sl);
		System.out.println(ss);
		System.out.println(sn);
		System.out.println(sc);
	}
}