package Day7;
import java.util.*;
public class twoDiArray {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter Rows and Column for Matrix : ");
		int row=s.nextInt();
		int col=s.nextInt();
		int a[][] = new int [row][col];
		s = new Scanner(System.in);
		System.out.println("Enter the array elements : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("\nTwo Dimentional Array : ");
		for(int[] i:a) {
			for(int j:i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
