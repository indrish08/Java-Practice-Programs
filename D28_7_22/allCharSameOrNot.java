package D28_7_22;

public class allCharSameOrNot {

	public static void main(String[] args) {
		int count=0;
		String str="GGGG";
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i-1)!=str.charAt(i)) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
