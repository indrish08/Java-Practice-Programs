package Day1;

import java.util.*;

public class numberOfDigits {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        int count = 0;        
        while(a!=0)
        {
            count++;
            a = a / 10;
        }
        System.out.print("\nNumber of Digits : ");
        System.out.print(count);
	}
}
