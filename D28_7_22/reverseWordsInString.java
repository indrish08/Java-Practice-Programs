package D28_7_22;

public class reverseWordsInString {

	public static void main(String[] args) {
		String str = "i love programming very much";
		String str2="";
		String strsin[]=str.split(" ");
		for(int i=strsin.length-1;i>=0;i--) {
			str2+=strsin[i]+" ";
		}
		System.out.println(str2);
	}

}
