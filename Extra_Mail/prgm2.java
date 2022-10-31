package Extra_Mail;
import java.util.*;
public class prgm2 {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		int ai=0, ani=0;
		System.out.print("Enter the Size of Array : ");
 		int n = 10;//s.nextInt();
 		int arr[] = new int[n];
 		System.out.println("\nEnter the Array Elements : ");
 		for (int i=0 ; i<n ; i++) {
 			arr[i] = (i+1)*10;//s.nextInt();
 		}
 		System.out.println("\n" + Arrays.toString(arr));
 		System.out.println("\nChoose : ");
 		System.out.println("1. Sum of Prime Index");
 		System.out.println("2. Sum of Non-Prime Index");
 		int x = s.nextInt();
 		switch(x) {
 			case 1:
 			{
 				for(int i=0;i<n;i++) {
 		 			int isp=isPrime(i);
 		 			if(isp==0) {
 		 				ai += arr[i];
 		 			}
 		 		}
 				System.out.println("\nSum : " + ai);
 				break;
 			}
 			case 2:
 			{
 				for(int i=0;i<n;i++) {
 		 			int isp=isPrime(i);
 		 			if(isp==1) {
 		 				ani += arr[i];
 		 			}
 		 		}
 				System.out.println("\nSum : " + ani);
 				break;
 			}
 			default:
 				System.out.println("Enter the number 1 or 2");
 		}
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