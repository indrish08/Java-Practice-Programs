package Extra_Mail;

public class stringEncode {
	public static long output1;
	public static String output2="";

	public static void main(String[] args) {
		String input1="AM2x9";
		encodeTheString(input1);
	}
	
	private static void encodeTheString(String str) {
		String a=str.toUpperCase();
		int ac=0, nc=0, key=0, tmp=0, temp=0, k=0;
		char ch;
		for(int i=0;i<str.length();i++) {
			temp=a.charAt(i);
			if(temp>=65&&temp<=90) {
				ac++;
			}
			if(temp>=48 &&temp<=57) {
				if(temp==48) {
					nc=0;
					break;
				}
				nc++;
				temp=Character.getNumericValue(str.charAt(i));
				key=key+(temp*temp);
			}
		}
		if(ac>0&&nc>0) {
			for(int i=0;i<str.length();i++) {
				temp=a.charAt(i);
				if(temp>=65&&temp<=90) {
					temp-=64;
					output2+=temp;
				}
				if(temp>=48 &&temp<=57) {
					temp=Character.getNumericValue(str.charAt(i));
					temp+=key;
					while(temp>26) {
						temp-=26;
					}
					if(i!=0) {
						k=i;
						while(k>0) {
							k--;
							tmp=a.charAt(k);
							if(tmp>=65&&tmp<=90) {
								break;
							}
						}
						if(k>0) {
							if(Character.isUpperCase(str.charAt(k))) {
								temp+=64;
							}else {
								temp+=96;
							}
						}else {
							
							temp+=64;
						}
					}else {
						temp+=64;
					}
					ch = (char)temp;
					output2+=ch;
				}
			}
		}
		output1=key;
		System.out.println("output1 : "+output1);
		System.out.println("output2 : "+output2);
	}
}
