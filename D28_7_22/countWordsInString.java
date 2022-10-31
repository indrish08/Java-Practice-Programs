package D28_7_22;

public class countWordsInString {

	public static void main(String[] args) {
		int count=0;
		String words[] = {"welcome","to", "geeks","portal"};
		String str = "geeksforgeeks is a computer science portal for geeks";
		String strsin[]=str.split(" ");
		for(int i=0;i<strsin.length;i++) {
			for(int j=0;j<words.length;j++) {
				if(strsin[i].equals(words[j])) {
					count++;
				}
			}
		}
		System.out.println("Output : "+count);
	}

}
