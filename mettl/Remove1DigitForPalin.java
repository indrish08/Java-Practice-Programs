package mettl;
public class Remove1DigitForPalin {
	public static void main(String[] args) {
        int input1=12332;
        System.out.println(input1);
        int n=digitRemove_Palin(input1);
        System.out.println("The Number to be Removed : "+n);
	}
    public static int digitRemove_Palin(int input1){
        int n=input1, fl=0, k=0, l=0;
		String s=String.valueOf(n);
		//identifying the extra digit
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				k=i;
				l=s.length()-1-i;
				fl++;
				break;
			}
		}
		//if the given number is already a palindrome 
		if(fl==0){
			return -1;
		}
		int n2=0;
		//removie that number
		for(int i=0;i<s.length();i++){
			if(i!=k){
				n2=(n2*10)+s.charAt(i)-48;
			}
		}
		n=n2;
		int n1=0;
		//reversing and comparing 
		while(n!=0){
			n1=(n1*10)+(n%10);
			n/=10;
		}
		if(n1==n2){
			return (int)s.charAt(k)-48;
		}
		return (int)s.charAt(l)-48;
    }   
}