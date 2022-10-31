package Extra2;

import java.util.Scanner;

public class replaceVowel {
	private static Scanner s;
	static String v  = "aeiouAEIOU";

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str  = s.nextLine();
		
		String rs  = ownMethod(str);
		System.out.println("\nMethod 1 : "+rs);
		
		String rs2  = replaceMethod(str);
		System.out.println("\nMethod 2 : "+rs2);
		}
	
	
	public static String ownMethod(String str) {
		String replaceString = "";
		char a[] = str.toCharArray();
		for(int i=0 ; i<str.length() ; i++) {
			for(int j=0 ; j<v.length() ; j++) {
				if(str.charAt(i) == v.charAt(j)) {
					a[i] = '*';
				}
			}
		}
		for(int i=0 ; i < str.length() ; i++) {
			replaceString += a[i]; 
		}
		return replaceString;
	}
	
	public static String replaceMethod(String str) {
		str=str.replace('a', '*');
		str=str.replace('e', '*');
		str=str.replace('i', '*');
		str=str.replace('o', '*');
		str=str.replace('u', '*');
		str=str.replace('A', '*');
		str=str.replace('E', '*');
		str=str.replace('I', '*');
		str=str.replace('O', '*');
		str=str.replace('U', '*');
		return str;
	}
}