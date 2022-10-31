import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0, n=s.nextInt();
		
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		System.out.println(sum);
		s.close();
	}

}
