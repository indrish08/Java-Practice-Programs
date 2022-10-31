package Day9;

import java.util.Scanner;

public class strRev {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//Enter String
		String str11=s.nextLine();
		String str22="";
		for(int i=str11.length()-1;i>=0;i--) {
			str22+=str11.charAt(i);
		}
		System.out.println("\nReversed String is : " + str22);
		s.close();
	}
}
