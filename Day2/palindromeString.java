package Day2;

import java.util.*;

public class palindromeString {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str1 = s.nextLine();
		//String str1 = "Indrish";
		String str2 = "";
		for(int i=str1.length()-1 ; i>=0 ; i--) {
			str2 = str2 + str1.charAt(i);
		}
		System.out.println("\nReversed String is : " + str2);
		if(str1.equals(str2)) {
			System.out.println("\nYes...The given String is palindrome");
		}else{
			System.out.println("\nNo...The given String is not palindrome");
		}
	}

}
