package Day11;

public class splitWithPos {

	public static void main(String[] args) {
		String str = "Welcome";
		int n=3; 
		int len=str.length();
		String[] spltStr = new String[len];
		for(int i=0;i<len/n;i++) {
			spltStr[i] = str.substring(0,n);
			System.out.println(spltStr[i]);
			str=str.substring(n);
		}
	}

}
