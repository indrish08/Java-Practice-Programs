package Extra_Mail;
import java.util.*;

public class OTPGenerator {

	public static long input2;
	public static String input1,input3,output="";
	public static int temp=0;
	public static char otp[] = new char[8];
	private static Scanner s;

	public static void main( String [] args ) {
		s = new Scanner(System.in);
		System.out.println("Name of the account holder : ");
		input1 = s.nextLine();
		
		System.out.println("Account Number : ");
		input2 = s.nextLong();
		
		s.nextLine();
		System.out.println("Type of the Account : ");
		input3 = s.nextLine();
		
		Validate(input1, input2, input3);

		System.out.println(output);
	}
	
	public static void Validate(String input1, long input2, String input3 ) {
		long t=input2;
		temp=0;
		while(t>0) {
			t /= 10;
			temp++;
		}
		if(input1.length() > 2) {
			if(temp==11) {
				if(input3.equals("Savings") || input3.equals("Current") || input3.equals("Loan")) {
					generateOTP(input1, input2, input3 ); //Test Cases
				}else {
					System.out.println("\nAccount type should be : [Savings / Current / Loan]");
				}
			}else {
				System.out.println("\nAccount Number must be 11 digits");
			}
		}else {
			System.out.println("\nAccount holder name's length should be minimum of 2");
		}
	}
	
	public static void generateOTP(String input1, long input2, String input3 ) {
		
		otp[0]=input3.charAt(0);
		otp[1]=input3.charAt(1);
		
		long tmp=input2/10000000000L;
		otp[2] = Long.toString(tmp).charAt(0);
		
		temp = (int) (input2/1000000);
		tmp = (long) (addUntilSingleDigit(temp));
		otp[3]= Long.toString(tmp).charAt(0);
		
		otp[4]=input1.charAt(0);
		
		temp = (int) ((input2%1000000)/10);
		tmp = (long) (addUntilSingleDigit(temp));
		otp[5]= Long.toString(tmp).charAt(0);
		
		otp[6]=input1.charAt(input1.length()-1);
		
		tmp = input2%10;
		otp[7]= Long.toString(tmp).charAt(0);
		
		for(int i=0 ; i < otp.length ; i++) {
			output += otp[i]; 
		}
	}
	
	public static int addUntilSingleDigit(int n) {
		int sum=0,rem=0;
		while(n > 0 || sum > 9){
			if(n==0){
				n=sum;
				sum=0;
			}
			rem = n % 10;
			sum += rem;
			n /= 10;
			}
		return sum;
	}
	
}