package logicPrgm;
import java.util.*;
public class tensHundreds {
	private static Scanner s;
	static int t=0, sum=0, as=3;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Values : ");
		int[] a = new int[as];
		for(int i=0;i<as;i++) {
			a[i] = s.nextInt();
		}
		System.out.println("\nEnter Input 4 : ");
		int n = s.nextInt();
		if(n==0) {}
		else if(n==1) {
			for(int i=0;i<as;i++) {
				if(a[i]<10) {
					a[i]=1;
				}else {
					a[i] = a[i] /10;
				}
			}
		}
		else if(n==2) {
			for(int i=0;i<as;i++) {
				if(a[i]<100) {
					a[i]=2;
				}else {
					a[i] = a[i] /100;
				}
			}
		}
		System.out.println();
		for(int i=0;i<as;i++) {
			t = a[i]%10;
			System.out.print(t + " ");
			sum += t;
		}
		System.out.println("  = "+sum);
	}
}