package Day1;
import java.util.Scanner;
public class repeatedNumbers {

	private static Scanner s;

	public static void main(String[] args) {
		int i,j;
		s = new Scanner(System.in);
//		int arr[] = {5,7,2,8,9,4,2,7,8,7};
//		int n = arr.length;
		System.out.print("Enter Size of Array : ");
		int n = s.nextInt();
		int[] arr = new int[n];
		int[] rep = new int[n];
		for(i=0 ; i<n ; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("\nRepeated Numbers are : ");	
		int k=0;
		for(i=0 ; i<n ; i++) {
			for(j=i+1; j<n ; j++) {
				if (arr[i] == arr[j]) {
					rep[k] = arr[i];
					k++;
				}
			}
		}
		for(i=0 ; i<k ; i++) {
			System.out.print(rep[i] + "\n");
		}
	}
}