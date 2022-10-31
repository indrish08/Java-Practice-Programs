package Day1;
import java.util.Scanner;
public class unique {

	private static Scanner s;

	public static void main(String[] args) {
		int i,j,count;
		s = new Scanner(System.in);
		//int arr[] = {5,7,2,8,9,4,2,7,8};
		//int n = arr.length;
		System.out.print("Enter Size of Array : ");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(i=0 ; i<n ; i++){
			arr[i] = s.nextInt();
		}
		for(i=0 ; i<n ; i++) {
			count = 0;
			for(j=0 ; j<n ; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count == 1) {
				System.out.print(arr[i] + " ");			
				}
		}
	}
}
