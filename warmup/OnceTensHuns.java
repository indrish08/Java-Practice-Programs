import java.util.Scanner;
public class OnceTensHuns {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=3;
		int[] a=new int[n];
		int once=0, tens=0, huns=0;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			once+=a[i]%10;
			tens+=(a[i]/10)%10;
			huns+=(a[i]/100)%10;
		}
		System.out.println("\nOnce : "+once+"\nTens : "+tens+"\nHuns : "+huns);
		s.close();
	}

}
