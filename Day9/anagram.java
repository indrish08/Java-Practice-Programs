package Day9;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("String 1 : ");
		String a=s.nextLine();
		System.out.print("String 2 : ");
		String b=s.nextLine();
		a=sortString(a);
		b=sortString(b);
		if(a.equals(b)) {
			System.out.println("\nThis is an anagram");
		}
		s.close();
	}
	
	private static String sortString(String k) {
		char [] s = k.toCharArray();
		Arrays.sort(s);
		String sorted = new String (s);
		return sorted;
	}
}
