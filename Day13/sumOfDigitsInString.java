package Day13;

import java.util.Scanner;

public class sumOfDigitsInString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str  = s.nextLine();
		String sn = "";
		int sum = 0,temp=0;
		int len=str.length();
		for(int i=0 ; i<len ; i++) {
			int asc = str.charAt(i);
			if (asc <= 57 && asc >= 48) {
				sn += str.charAt(i);
				temp=Character.getNumericValue(asc);
				sum += temp;
			}
		}
		System.out.println("\nDigits in the String is : " + sn);
		System.out.println("Sum of Digits in the String is : " + sum);
		s.close();
	}

}
