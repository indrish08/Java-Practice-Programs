package Day11;

import java.util.Scanner;

public class stringValidation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int tmp=0, cnt=0; 
		String str = "Indrish";
		int len=str.length();
		
		System.out.println("Check : ");
		System.out.println("1. String Length should be minimum 5 and Maximum 15");
		System.out.println("2. It should not contain blank spaces or numbers");
		System.out.println("3. It should not contain only blank spaces.");
		int choose = s.nextInt();
		System.out.println();
		switch(choose) {
		case 1:
			if(len>=5 && len<=15) {
				System.out.println("Validated");
			}else {
				System.out.println("Not Validated");
			}
			break;
		
		case 2:
			for(int i=0;i<len;i++) {
				tmp=str.charAt(i);
				if(tmp == 32 || tmp>=48 && tmp<=57) {
					cnt++;
				}
			}
			if(cnt==0) {
				System.out.println("Validated");
			}else {
				System.out.println("Not Validated");
			}
			break;
		
		case 3:
			for(int i=0;i<len;i++) {
				tmp=str.charAt(i);
				if(tmp == 32) {
					cnt++;
				}
			}
			if(cnt==0) {
				System.out.println("Validated");
			}else {
				System.out.println("Not Validated");
			}
			break;
		
		}
		s.close();

	}

}
