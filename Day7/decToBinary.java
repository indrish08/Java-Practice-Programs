package Day7;
import java.util.Scanner;
public class decToBinary {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int dec = s.nextInt();
		int bin = 0;
		int i=0;
		int[] a = new int[100];
		while(dec>0) {
			a[i] = (dec % 2);
			dec /= 2;
			i++;
		}
		while(i>=0) {
			bin = bin *10 + a[i];
			i--;
		}
		System.out.println("\nBinary : " + bin);
	}
}