package Extra_Mail;

public class passwordValidation {
	
	private static String output1="";
	private static int slc,clc,alc,numc,scc;
	
	public static void main( String [] args ) {
		String input1="v2aLi5D@p9ass^";
		userMethod(input1); 
		System.out.println( output1 ); 
	}
	
	public static void userMethod(String input1) {
		int pass=0;
		int temp=0;
		int inlen=input1.length();
		
		if(inlen >= 8 && inlen <=28) {
			pass++;
		}
		
		temp = findSLCLNUMSC(input1.charAt(0));
		if(temp == 2 || temp == 3) {
			pass++;
		}
		
		temp=findSLCLNUMSC(input1.charAt(inlen-1));
		if(temp == 4) {
			pass++;			
		}
		
		slc=0;clc=0;alc=0;numc=0;scc=0;
		for(int i=0;i<inlen;i++) {
			findSLCLNUMSC(input1.charAt(i));
		}
		alc=slc+clc;
		
		if(alc>=3) {
			pass++;
		}
		if(clc>=1) {
			pass++;
		}
		if(slc>=2) {
			pass++;
		}
		if(scc>=1) {
			pass++;
		}
		if(numc>=2) {
			pass++;
		}
		
		int t1=0,t2=0,t3=0,noOfEql=0;
		for(int i=0;i<inlen-2;i++) {
			t1=input1.charAt(i);t2=input1.charAt(i+1);t3=input1.charAt(i+2);
			if(t1==t2 && t2==t3) {
				noOfEql++;
			}
		}
		if(noOfEql==0) {
			pass++;
		}

		if(pass==9) {
			output1="Valid";
		}else {
			output1="Invalid";			
		}
	}
	private static int findSLCLNUMSC(char ch) {
		int asc = ch;
		if(asc>=48 && asc<=57) {
			numc++;
			return 1;
		}else if(asc>=65 && asc<=90) {
			clc++;
			return 2;
		}else if(asc>=97 && asc<=122) {
			slc++;
			return 3;
		}
		else {
			scc++;
			return 4;			
		}
	}
}