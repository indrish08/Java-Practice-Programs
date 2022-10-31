package Day13;

import java.util.Scanner;

public class strAscAndDesc {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int len=s.nextInt();
		len++;
		String[] a = new String[len];
		String temp="";
		for(int i=0;i<len;i++) {
			a[i]=s.nextLine();
		}
		for(int i=1;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if((a[i].compareTo(a[j])) > 0){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nAscending Order : ");
		for(int i=1;i<len;i++) {
			System.out.println(a[i]);
		}
		for(int i=1;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if((a[i].compareTo(a[j])) < 0){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nDescending Order : ");
		for(int i=1;i<len;i++) {
			System.out.println(a[i]);
		}
		s.close();
	}

}
