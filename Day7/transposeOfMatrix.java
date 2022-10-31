package Day7;

import java.util.Scanner;

public class transposeOfMatrix {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter Rows and Column for 1st Matrix : ");
		int row=s.nextInt();
		int col=s.nextInt();
		int a[][] = new int [row][col];
		int tr[][] = new int [row][col];
		s = new Scanner(System.in);
		System.out.println("Enter the array elements : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j] = s.nextInt();
			}
		}

		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				tr[i][j] = a[j][i];
			}
		}
		
		System.out.println("\nTranspose of the given Matrix : ");
		for(int[] i:tr) {
			for(int j:i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
