package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class sumPrimeIndex {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		int ai=0;
		System.out.print("Enter the Size of Array : ");
 		int n = s.nextInt();
 		int arr[] = new int[n];
 		System.out.println("\nEnter the Array Elements : ");
 		for (int i=0 ; i<n ; i++) {
 			arr[i] = s.nextInt();
 		}
 		System.out.println("\n" + Arrays.toString(arr));
 		for(int i=0;i<n;i++) {
 		 	int isp=isPrime(i);
 		 	if(isp==0) {
 		 	ai += arr[i];
 		 	}
 		}
 		System.out.println("\nSum of Prime Index : " + ai);
 		
 		int k =9;
 		System.out.println(isPrime(k));
	}
	
	public static int isPrime(int p) {
		if(p==0||p==1){  
			return 1;
	    }else{  
	        for(int i=2;i<=p/2;i++){      
	        if(p%i==0){
	        	return 1;   
	        }    
	        }      
	   return 0;
	   }  
	}
}