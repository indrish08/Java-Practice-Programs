package Day13;

import java.util.Scanner;

public class addTwoNumForTarget {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num[]= {1,2,3,4,6,8};
		int len=num.length;
		System.out.print("Enter the Target : ");
		int t=s.nextInt(); //5;
		System.out.println();
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(num[i]+num[j]==t) {
					System.out.println("Index "+i+" = "+num[i]+"  &  Index "+j+" = "+num[j]);
				}
			}
		}
		s.close();		
	}

}
