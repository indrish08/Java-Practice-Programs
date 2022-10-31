package Extra_Mail;

import java.util.Arrays;

public class sumAndEncodeArray {

	public static void main(String[] args) {
		int i=0,sum=0;
		int[] orgArray = { 8, -10, 3, -15};
		int len=orgArray.length;
		int[] encodedArray = new int[len];
		
		for(i=0;i<len-1;i++) {
				encodedArray[i] = orgArray[i+1] - orgArray[i];		
		}
		encodedArray[len-1] = orgArray[len-1] ;
		System.out.println("Original array = "+Arrays.toString(orgArray));
		System.out.println("\nEncoded array = "+Arrays.toString(encodedArray));
		
//		for(i=0;i<len;i++) {
//			System.out.print(encodedArray[i]+" ");
//		}
		System.out.println("\nFirst number in the original array = "+orgArray[0]);
		for(i=0;i<len;i++) {
			sum += orgArray[i];		
		}
		System.out.println("\nSum of all numbers in original array = "+sum);
	}

}