package Day7;
import java.util.*;
public class floydTriangle {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter number of Rows : "); 
		int n = s.nextInt();
		int a=1;
		
		System.out.println("\nFloyd's Triangle : \n"); 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a +" ");
				a++;
			}
			System.out.println();
		}
	}

}
