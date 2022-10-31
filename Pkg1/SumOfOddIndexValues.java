package Pkg1;

import java.util.Scanner;

public class SumOfOddIndexValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		int sum=0;
		System.out.println("Array values : ");
		for(int i=0;i<10;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(i%2!=0)
			sum+=a[i];
		}
		System.out.println(sum);
		sc.close();
	}

}
