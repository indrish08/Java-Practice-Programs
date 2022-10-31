package logicPrgm;
import java.util.*;
public class ascAndNonRept {
	static int t=0,len;

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int n = s.nextInt();
		int[] ar = new int[n];
		int[] opar = new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		
		sortArray(ar);
		System.out.println("\nOrdered Array : \n" + Arrays.toString(ar));
		
		removeRept(ar,opar,n);
		System.out.println("\nOutput Array : \n");
		for(int i=0;i<len;i++) {
			System.out.print(opar[i] + " "); 
		}
		
	}
	
	public static void sortArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
	}
	
	public static int removeRept(int[] a,int[] opar,int n) {
		int k=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[i+1]) {
				opar[k] = a[i];
				k++;
			}
		}
		opar[k]=a[n-1];
		len=k;
		return len;
	}

}
