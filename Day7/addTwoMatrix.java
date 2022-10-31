package Day7;
import java.util.Scanner;
public class addTwoMatrix {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter Rows and Column for 1st Matrix : ");
		int r=s.nextInt();
		int c=s.nextInt();
		System.out.println("Enter Rows and Column for 2st Matrix : ");
		int r1=s.nextInt();
		int c1=s.nextInt();
		int a[][]=new int[r][c];
		int m1[][]=new int[r][c];
		int m2[][]=new int[r1][c1];
		System.out.println("\nEnter Matrix 1 Elements : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				m1[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter Matrix 2 Elements : ");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				m2[i][j] = s.nextInt();
			}
		}
		System.out.println("\nAnswer Matrix : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]	= m1[i][j] + m2[i][j];
			}
		}
		for(int[] i:a) {
			for(int j:i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}