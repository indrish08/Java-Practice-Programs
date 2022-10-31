package mettl;
// https://tests.mettl.com/authenticateKey/d612c0e6 
public class totalHillWeight {
	public static void main(String[] args) {
		int input1=5;
		int input2=10;
		int input3=2;
		int sum=0,temp=0;
		for(int i=1;i<=input1;i++){
			temp=i;
			while(temp>0){
				sum+=input2;
				temp--;
			}
		input2+=input3;
		}
		System.out.println(sum); //230
	}
	
}
