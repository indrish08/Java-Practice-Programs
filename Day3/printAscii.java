package Day3;
import java.util.*;
public class printAscii {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		char ch = s.next().charAt(0);
		int a = ch;
		System.out.println("\nAscii value for the given Character is : " + a);
	}

}
