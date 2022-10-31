package Day11;
import java.util.*;
public class trianglePattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=4;
		char c ='A';
		for(int i=1;i<=row;i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(c + " ");
			}
			c++;
			System.out.println();
		}
		s.close();
	}
}
