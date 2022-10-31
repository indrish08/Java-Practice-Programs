package D28_7_22;

import java.util.Scanner;

public class revStrWithSpacePos {
	private static Scanner s;
	public static void main(String[] args) {
		s=new Scanner(System.in);
		String str=s.nextLine(); //"Help others";
		String str2="";
		int k=0,len=str.length(), count=0;
		char sarr[]=str.toCharArray();
		int pos[]=new int[str.length()];
		for(int i=0;i<len;i++) {
			if(str.charAt(i)==' ') {
				count++;
				pos[i]=1;
				continue;
			}
			sarr[k]=str.charAt(i);
			k++;
		}
		
		k=len-(count+1);
		for(int i=0;i<str.length();i++) {
			if(pos[i]==1) {
				str2+=" ";
				i++;
			}
			str2+=sarr[k];
			k--;
		}
		System.out.println(str2);
	}
}
