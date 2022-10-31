package Extra2;
import java.util.*;
public class splitString {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String str = s.nextLine();
        String[] arrOfStr = str.split(" ", str.length());
        System.out.println("\nAfter Splitting : ");
        for (String a : arrOfStr)
            System.out.println(a);
	}

}
