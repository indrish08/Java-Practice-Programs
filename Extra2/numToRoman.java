package Extra2;

import java.util.*;

public class numToRoman {
	private static String tmp="", roman="";
	private static int temp=0, ones=0, tens=0;
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n=s.nextInt();
		if(n<=10||n==100) {
			roman=findRoman(n);			
		}else if(n>=11 && n<=99) {
			temp=n;
			ones=temp%10;
			tens=((temp%100)/10);
			System.out.println("\nTens : "+tens+"  Once : "+ones);
			roman = twoDigit(tens) + findRoman(ones);
		}
		System.out.println("\nRoman Letter : "+roman);
	}
	
	private static String twoDigit(int tens) {
		if(tens<=3) {
			for(int i=1;i<=tens;i++) {
				tmp+=findRoman(10);
			}
		}
		if(tens==4) {
			tmp=findRoman(10) + findRoman((tens+1)*10);
		}
		if(tens==5) {
			tmp=findRoman((tens)*10);
		}
		if(tens>=6&&tens<=8) {
			tmp+=findRoman((5)*10);
			for(int i=1;i<=tens-5;i++) {
				tmp+=findRoman(10);
			}
		}
		if(tens==9) {
			tmp=findRoman(10) + findRoman((tens+1)*10);
		}
		
		return tmp;
	}
	
	private static String findRoman(int k) {
		String value="";
		switch(k) {
		case 1:
			value+="I";
			break;
		case 2:
			value+="II";
			break;
		case 3:
			value+="III";
			break;
		case 4:
			value+="IV";
			break;
		case 5:
			value+="V";
			break;
		case 6:
			value+="VI";
			break;
		case 7:
			value+="VII";
			break;
		case 8:
			value+="VIII";
			break;
		case 9:
			value+="IX";
			break;
		case 10:
			value+="X";
			break;
		case 50:
			value+="L";
			break;
		case 100:
			value+="C";
			break;
		}
		return value;
	}

}
