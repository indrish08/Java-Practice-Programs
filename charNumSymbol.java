
public class charNumSymbol {

	public static void main(String[] args) {
		String str="AbC123";
		char carr[]=str.toCharArray();
		System.out.println("Characters : ");
		for(int i=0;i<carr.length;i++) {
			if(Character.isAlphabetic(carr[i])) {
				System.out.println(carr[i]);
			}
			
		}
		System.out.println("\nNumbers : ");
		for(int i=0;i<carr.length;i++) {
			if(Character.isDigit(carr[i])) {
				System.out.println(carr[i]);				
			}
		}
	}

}
