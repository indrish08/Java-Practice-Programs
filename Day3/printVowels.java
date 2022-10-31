package Day3;

import java.util.*;

public class printVowels {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str  = s.next(); //"Indrish";
		String v  = "aeiouAEIOU";
		int n2 = v.length();
		int n1 = str.length();
		System.out.println("\nVowels present in the String is : ");
		for(int i=0 ; i<n1 ; i++) {
			for(int j=0 ; j<n2 ; j++)
			if(str.charAt(i) == v.charAt(j)) {
				System.out.println(str.charAt(i));
			}
		}
	}

}
