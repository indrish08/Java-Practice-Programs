package Extra2;

import java.util.Scanner;

public class romanToNum {
	private static int number=0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Roman Letter : ");
		String r=s.nextLine(); //"XCIX";
		s.close();
		char a[]= new char[15];
		for(int i=0;i<r.length();i++) {
			a[i]=r.charAt(i);
		}
		for(int i=0;i<r.length();i++) {
			if(a[i]=='I' && a[i+1]=='V') {
				number+=4;
				i++;
			}else if(a[i]=='X' && a[i+1]=='L') {
				number+=40;
				i++;
			}else if(a[i]=='I' && a[i+1]=='X') {
				number+=9;
				i++;
			}else if(a[i]=='X' && a[i+1]=='C') {
				number+=90;
				i++;
			}else {
				number+=findNum(a[i]);
			}
		}
		System.out.println("\nNumber : "+number);
	}
	private static int findNum(int k) {
		int value=0;
		switch(k) {
		case 'I':
			value+=1;
			break;
		case 'V':
			value+=5;
			break;
		case 'X':
			value+=10;
			break;
		case 'L':
			value+=50;
			break;
		case 'C':
			value+=100;
			break;
		}
		return value;
	}

}
