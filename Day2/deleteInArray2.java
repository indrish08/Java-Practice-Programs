package Day2;
import java.util.*;

public class deleteInArray2{

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int i,j;
		System.out.print("Enter the Size of Array : ");
 		int n = s.nextInt();
 		int arr[] = new int[n];
 		System.out.println("Enter the Array Elements : ");
 		for (i=0 ; i<n ; i++) {
 			arr[i] = s.nextInt();
 		}
 		System.out.println("\nEnter the Element to be Deleted : ");
 		int e = s.nextInt();
 		for(i=0 ; i<n ; i++) {
 			if(arr[i] == e) {
 				for(j=i ; j<n-1 ; j++) {
 		 			arr[j] = arr[j+1];
 				}
 				break;
 			}
 		}
 		System.out.println("\nArray after Deletion : ");
 		for (i=0 ; i<n-1 ; i++) {
 			System.out.print(arr[i] + " ");
 		}
	}
}