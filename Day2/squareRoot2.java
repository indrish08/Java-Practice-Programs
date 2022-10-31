package Day2;
import java.util.*;
public class squareRoot2 {
	private static Scanner scan;

	public static void main(String args[]) {
		scan = new Scanner(System.in);
		int ans=0;
		System.out.print("Enter a Number : ");
		int n = scan.nextInt();
		for (int i=2 ; i<n/2 ; i++) {
			if(i*i == n) {
				ans=i;
				break;
			}
		}
		if(ans!=0) {
			System.out.println("\nSquare root of " + n + " is : " + ans);
		}else {
			System.out.println("\nEnter correct number..!!");
		}
	}
}