package Day2;
import java.util.*;

public class power {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		System.out.print("Enter the Power : ");
		int p = s.nextInt();
		int result = 1;
		while (p!=0)
		{
			result = result * n;
			p--;
		}
		System.out.println(result);
	}
}
