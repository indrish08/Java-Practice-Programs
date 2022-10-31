package Pkg1;
import java.util.Scanner;
public class PrimeInRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=200; //sc.nextInt();
		int n2=300; //sc.nextInt();
		sc.close();
		boolean b;
		for(int n=n1;n<=n2;n++) {
			b=true;
			for(int i=2;i<(n/2)+1;i++) {
				if(n%i==0) {
					b=false;
					break;
				}
			}
			if(b)
			System.out.println(n);
		}
	}}
