package Day1;
import java.util.*;

public class sumOfElements {
	private static Scanner sc;

	public static void main(String args[]){
        sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int a = sc.nextInt();
        int[] arr=new int[a];
        int sum=0;
        System.out.println("Enter the Array Elements : ");
        for(int i =0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i =0 ; i < arr.length ; i++){
            sum = sum + arr[i];
        }
        System.out.print("\nSum of Array Elements : " + sum);
	}
}
