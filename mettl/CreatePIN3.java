package mettl;
// https://tests.mettl.com/v2/authenticateKey/be582d9f
import java.util.Arrays;
public class CreatePIN3 {
    public static void main(String[] args) {
        int input1=123;
        int input2=582;
        int input3=175;
        // Expected Output = 8122
        System.out.println(solution(input1, input2, input3));
    }
    static int solution(int input1,int input2,int input3){    
        int min=0, max=0,pin=0,k=0;
		int ar[]=new int[3];
		int armax[]=new int[3];
		int i=100;
		while(i>0){
			ar[0]=(input1/i)%10;
			ar[1]=(input2/i)%10;
			ar[2]=(input3/i)%10;
			min=findMin(ar);
			armax[k]=findMax(ar);
			k++;
			pin=pin*10+min;
			i/=10;
		}
		max=findMax(armax);
		pin=max*1000+pin;
		return pin;
	}
	static int findMin(int ar[]){
		int min=0;
		Arrays.sort(ar);
		min=ar[0];
		return min;
	}
	static int findMax(int ar[]){
		int max=0;
		Arrays.sort(ar);
		max=ar[2];
		return max;
	}
}