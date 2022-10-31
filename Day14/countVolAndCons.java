package Day14;

public class countVolAndCons {

	public static void main(String[] args) {
		String str="Programming";
		String vol="aeiouAEIOU";
		int volc=0,consc=0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<vol.length();j++) {
				if(str.charAt(i)==vol.charAt(j)) {
					volc++;
				}
			}
		}
		consc=str.length()-volc;
		System.out.println("String : "+str);
		System.out.println("\nVowel Count : "+volc);
		System.out.println("Constant Count : "+consc);

	}

}
