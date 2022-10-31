package Day7;
import java.util.*;
public class pascalsTriangle {
	private static Scanner s;
		public static void main(String[] args) {
		s = new Scanner(System.in);
		int i,j,k;
		System.out.print("Enter number of Rows : ");
		int row = s.nextInt();
		System.out.println();
		for(i=1 ; i<=row ; i++) 
		{
			int s=1;
			for(j=0 ; j<row-i ; j++)
			{
				System.out.print(" ");
			}
			for(k=1 ; k<=i ; k++)
			{
				System.out.print(" " + s); 
				s=s*(i-k)/k;
			} 
			System.out.println();
		}
	}
}
