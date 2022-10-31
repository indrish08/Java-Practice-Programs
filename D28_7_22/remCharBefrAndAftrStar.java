package D28_7_22;

public class remCharBefrAndAftrStar {

	public static void main(String[] args) {
		String s="abcd*efgh*de";
		String str2="";
		
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i+1)=='*') {
				i+=2;
			}else {
				str2+=s.charAt(i);
			}
		}
		if(s.charAt(s.length()-1)!='*') {
			str2+=s.charAt(s.length()-1);
		}
		System.out.println(str2);
		
	}

}
