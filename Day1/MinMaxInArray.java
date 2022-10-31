package Day1;
import java.util.*;
public class MinMaxInArray {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter the Array size : ");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("\nEnter the elements of Array : ");
		for(int i = 0 ; i<n ; i++) {
			arr[i] = s.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i = 0 ; i<n ; i++) {
			if(arr[i] > max) {
				max=arr[i];
			}
			if(arr[i] < min) {
				min=arr[i];
			}
		}
		
		System.out.println("\nThe Maximum element in the Array is : " + max);
		System.out.println("\nThe Minimum element in the Array is : " + min);

	}

}
