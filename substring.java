public class substring {

	public static void main(String[] args) {
		String str = "programming";
		int n=3,len=str.length()-(n-1);
		for(int i=0;i<len;i++) {
			System.out.println(str.substring(i, n));
			n++;
		}
	}

}
