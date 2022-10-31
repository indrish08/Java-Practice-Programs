package mettl;
// https://tests.mettl.com/v2/authenticateKey/92437794
public class SumOfPowersOfDigits {
    public static void main(String[] args) {
        int input1=582109;
        int res=sumOfPowerOfDigits(input1);
        System.out.println(res);  // 390693
    }
    public static int sumOfPowerOfDigits(int input1){
		// Read only region end
		// Write code here...	
		int n=0, ans=0;
		while(input1!=0){
			n=n*10+input1%10;
			input1/=10;
		}
		while(n>9){
			// ans+=Math.pow(n%10, (n/=10)%10);
			ans+=power(n%10, (n/=10)%10);
		}
		return ans+1;
	}
	static int power(int n,int n2){
		int a=1;
		while(n2-->0){
			a*=n;
		}
		return a;
	}

}
