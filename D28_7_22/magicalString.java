package D28_7_22;

public class magicalString {

	public static void main(String[] args) {
		String str="akshay";
		String str2="";		
		for(int i=0;i<str.length();i++) {
			str2+=reciprocal(str.charAt(i));
		}
		System.out.println(str2);
	}
	
	private static char reciprocal(char c) {
		char k='?';
		if(c>=65&&c<=90) {
			k=(char)(90-((c-64)-1));
		}else if(c>=97&&c<=122) {
			k=(char)(122-((c-96)-1));			
		}
		return k;
	}

}