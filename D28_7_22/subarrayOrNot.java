package D28_7_22;

public class subarrayOrNot {

	public static void main(String[] args) {
		int A[] = {2, 3, 0, 5, 1, 1, 2};
		int B[] = {3, 0, 5, 1};
		int count=0;
		for(int i=0;i<B.length;i++) {
			for(int j=0;j<A.length;j++) {
				System.out.println(B[i]+" "+A[j]);
				if(B[i]==A[j]) {
					count++;
					break;
				}
			}System.out.println();
		}
		if(count==B.length) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
