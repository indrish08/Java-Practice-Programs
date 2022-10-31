package Day2;
import java.util.*;

public class armstrong {

	private static Scanner s;

	public static void main(String[] args) {
		int rem,temp,sum=0;
		s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		temp = n;
		while(n!=0)
		{
			rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10;
		}
		if(sum == temp)
			System.out.println("\n" +temp + " is an Amstrong Number");
		else
			System.out.println("\n" + temp + " is not an Armstrong Number");
	}
}