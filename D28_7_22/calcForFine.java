package D28_7_22;

public class calcForFine {

	public static void main(String[] args) {
		int carNum[]= {3, 4, 1, 2};
		int arrcf[]= new int[carNum.length];
		int n=-1, fine=0, date = 15;
		for(int i=0;i<carNum.length;i++) {
			if(oddOrEven(date)!=oddOrEven(carNum[i])) {
				n++;
				arrcf[n]=carNum[i];
				fine+=250;
			}
		}
		System.out.println("Total Fine : "+fine);
		System.out.print("Car with numbers ");
		int l=0;
		while(l<=n) {
			System.out.print(" "+arrcf[l]+" ");
			l++;
		}
		System.out.print(" will be fined 250 each.");
		
	}
	
	private static boolean oddOrEven(int n) {
		if(n%2==0) {
			return true;
		}else {
			return false;
		}		
	}

}
