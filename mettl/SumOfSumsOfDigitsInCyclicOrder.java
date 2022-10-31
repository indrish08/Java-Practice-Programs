package mettl;
// https://tests.mettl.com/v2/authenticateKey/1ddbe65e
public class SumOfSumsOfDigitsInCyclicOrder {
    public static void main(String[] args) {
        int input1=582109;
        int sum=0, len=0, n=0;
		len=(Integer.toString(input1)).length();
		while(len!=0){
			n=input1 % ((int) Math.pow(10,len));
			while(n!=0){
				sum+=n%10;
				n/=10;
			}
			len--;
		}
		// Alternative
		// int t=0;
		// while(len!=0){
		// 	n=input1;
		// 	t=len;
		// 	while(t!=0){
		// 		sum+=n%10;
		// 		n/=10;
		// 		t--;
		// 	}
		// 	len--;
		// }
		System.out.println(sum);
	}
}
