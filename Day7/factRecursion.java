package Day7;
import java.util.*;
public class factRecursion {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		int f = fact(n);
		System.out.println("\nFactorial of given number : " + f);
	}

	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}

}
