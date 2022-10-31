package Day3;

import java.util.Scanner;

public class stringReverse {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str  = s.next();
		String str2 = "";
		
		for(int i=str.length()-1 ; i>=0 ; i--) {
			str2 += str.charAt(i);
		}
		System.out.println("\nUsing Loop : ");
		System.out.println(str2);
		
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		System.out.println("\nUsing Method : ");
		System.out.println(sb.reverse());
	}

}
