package Extra2;

import java.util.Scanner;

public class ascAndDesc {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int n = s.nextInt();
		int a[] = new int [n];
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		int t=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] > a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}		
		}
		System.out.println("\nAscending Order : ");
		for(int i:a)
			System.out.print(i + " ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] < a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("\nDescending Order : ");
		for(int i:a)
			System.out.print(i + " ");
	}

}
