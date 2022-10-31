package Day2;
import java.util.*;

public class deleteInArray {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int i;
		System.out.print("Enter the Size of Array : ");
 		int n = s.nextInt();
 		int arr[] = new int[1000];
 		System.out.println("Enter the Array Elements : ");
 		for (i=0 ; i<n ; i++) {
 			arr[i] = s.nextInt();
 		}
 		System.out.println("\nEnter the Position to be deleted : ");
 		int pos = s.nextInt();
 		for(int j=0 ; j<n ; j++) {
 			if(j>=pos-1) {			
 				arr[j] = arr[j+1];
 			}
 		}
 		System.out.println("\nArray after Insertion : ");
 		for (i=0 ; i<n-1 ; i++) {
 			System.out.print(arr[i] + " ");
 		}
 		
	}

}