package StringProgram;
import java.util.Scanner;

public class uniqueCharInString {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str  = s.nextLine();
		int len = str.length();
		int a[] = new int [len];
		System.out.println("\nNon Repeated characters in the String : ");
		for(int i=0 ; i<len ; i++) {
			int count=1;
			for(int j=i+1 ; j<len ; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
					a[j] = -1;
				}
			}
			if (a[i]!=-1){
				a[i]=count;
			}
			if(a[i]==1) {
				System.out.print(str.charAt(i));
			}		
		}
	}
}