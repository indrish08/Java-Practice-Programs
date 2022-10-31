package Day1;

import java.util.*;

public class printArray {
	 private static Scanner sc;

	public static void main(String args[]){
	        sc = new Scanner(System.in);
	        System.out.print("Enter size of Array : ");
	        int a = sc.nextInt();
	        int[] arr=new int[a];
	        System.out.println("Enter the Array Elements : ");
	        for(int i =0 ; i < arr.length ; i++){
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("\nNumbers in Array : ");
	        for(int i =0 ; i < arr.length ; i++){
	        System.out.print(arr[i] + " ");
	        }
	    }
}
