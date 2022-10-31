package Day14;

import java.util.Scanner;

public class replaceKeyToStar {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = s.nextLine();   //"Programming";
		System.out.print("Enter the key : ");
		char key=s.nextLine().charAt(0);   //'m';
		str=str.replace(key, '*');
		System.out.println("\n"+str);
		
	}

}
