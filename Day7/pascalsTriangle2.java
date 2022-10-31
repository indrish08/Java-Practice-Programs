package Day7;
import java.util.*;
public class pascalsTriangle2 {
	private static Scanner s;
	public static void main(String[] args) {
	s = new Scanner(System.in);
	int i,j,k;
	System.out.print("Enter number of Rows : ");
	int row = s.nextInt();
	System.out.println();
	for(i=0 ; i<row ; i++) 
	{
		for(j=0 ; j<row-i ; j++)
		{
			System.out.print(" ");
		}
		for(k=0 ; k<=i ; k++)
		{
			System.out.print(" " + fact(i) / ( fact(i-k) * fact(k)));
		} 
		System.out.println();
	}
}

public static int fact(int n) {
	if(n==0)
	{
		return 1;
	}
	return n * fact(n-1);
}
}
