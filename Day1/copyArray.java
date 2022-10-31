package Day1;
import java.util.*;
public class copyArray {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter the Array size : ");
		int n = s.nextInt();
		int i;
		int[] arr1 = new int[n];
		int[] dest = new int[n];
		System.out.println("\nEnter the elements of First Array : ");
		for(i=0 ; i<n ; i++) {
			arr1[i] = s.nextInt();
		}
		
		System.arraycopy(arr1, 0, dest, 0, arr1.length);
		
		System.out.println("\nDestination Array :");
		for(i=0 ; i<n ; i++) {
			System.out.print(dest[i] + " ");
		}		
	}	
}