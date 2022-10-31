package Day9;

import java.util.Scanner;

public class twoStrEqlOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("String 1 : ");
		String a=s.nextLine();
		System.out.print("String 2 : ");
		String b=s.nextLine();
		int count=0,len=a.length();
		char[] ac=a.toCharArray();
		char[] bc=b.toCharArray();
		for(int i=0;i<len;i++) {
			if(ac[i]==bc[i]) {
				count++;
			}
		}
		if(count==len) {
			System.out.println("\nTwo Strings are Equal");
		}else {
			System.out.println("\nTwo Strings are not Equal");			
		}
		s.close();
	}

}
