package mettl;

public class sumOfPowerOfDigits {
    public static void main(String[] args) {
        int n=582109;
		int len=0, sum=0;
        int a[]=new int[100];
		while(n!=0){
			a[len]=n%10;
			n/=10;
			len++;
		}
		int i=len-1;
		while(i>0){
			// System.out.println(a[i]+" "+a[i-1]+" ------ ");
			sum+=powerOf(a[i],a[i-1]);
			i--;
		}
		sum++;
        System.out.println(sum);
	}

	static int powerOf(int n1, int n2){
		int num=1;
		while(n2!=0){
			num*=n1;
			n2--;
		}
		return num;        
    }
}