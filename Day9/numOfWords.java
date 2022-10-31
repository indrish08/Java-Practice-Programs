package Day9;

import java.util.Scanner;

public class numOfWords {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int count=0;
		System.out.println("Enter a Sentence : ");
		String str = s.nextLine();
        String[] arrOfStr = str.split(" ", str.length());
        for(int i=0;i<arrOfStr.length;i++) {
        	if(arrOfStr[i].equals("")) {
        		continue;
        	}else {
        	count++;
        	}
        }
        System.out.println("\nNumber of words in the line : " + count);
	}
}