package Day3;

import java.util.*;

public class ageCalculation {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter your Bitrh Date (DD-MM-YYYY) : ");
		int d1 = s.nextInt();
		int m1 = s.nextInt();
		int y1 = s.nextInt();
		int d2=18, m2=07, y2=2022;
		int d3=0,m3=0,y3=0;
		if(d1<=31 && m1<=12) {
			if(d1>d2) {
				m2--;
				d2 += 30;
				d3=d2-d1;
			}else {
				d3=d2-d1;
			}
			if(m1>m2) {
				y2--;
				m2 += 12;
				m3=m2-m1;
			}else {
				m3=m2-m1;
			}
			y3=y2-y1;
			System.out.println("\nAge : "+y3+" Years, "+m3+" Months and "+d3+" Days.");
		}else {
			System.out.println("\nEnter Valid Date..!!");
		}
		
		
	}

}
