package Day13;

public class stringTriangle {

	public static void main(String[] args) {
		String str="Hyderabad";
		int len=str.length();
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}

		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
