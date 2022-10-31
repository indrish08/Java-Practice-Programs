package Day11;

public class replaceString {

	public static void main(String[] args) {
		String str= "My name is kumar.";
		String[] arrs=str.split(" ");
		String strnew = new String ();
		
		for(int i=0;i<arrs.length;i++) {
			if(arrs[i].equals("is")) {
				arrs[i]="was";
			}
			strnew += arrs[i];
			strnew += " ";
		}
		System.out.println(strnew);
	}

}
