package Day1;
import java.util.*;
public class margeArray {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter the Array size : ");
		int n = s.nextInt();
		int i;
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int fal = arr1.length;
		int sal = arr2.length;
		int destl = fal + sal;
		int[] dest = new int[destl];
		System.out.println("\nEnter the elements of First Array : ");
		for(i=0 ; i<n ; i++) {
			arr1[i] = s.nextInt();
		}
		System.out.println("\nEnter the elements of Second Array : ");
		for(i=0 ; i<n ; i++) {
			arr2[i] = s.nextInt();
		}

		System.arraycopy(arr1, 0, dest, 0, fal);
		System.arraycopy(arr2, 0, dest, fal, sal);
		
		System.out.println("\nDestination Array :");
		for(i=0 ; i<destl ; i++) {
			System.out.print(dest[i] + " ");
		}		
	}	
}
