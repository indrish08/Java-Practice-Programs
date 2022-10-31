package mettl;

public class GetCodeThroughStrings {
    public static void main(String[] args) {
        String input1="The Good The Bad and The Ugly";
        int n=getCodeThroughStrings(input1);
        System.out.println(n); // 5
    }
    public static int getCodeThroughStrings(String input1){
		// Read only region end
		// Write code here...
		String[] s=input1.split("[ ]");
		int n=0;
		for(String ss:s){
			n+=ss.length();
		}
		int sum=0;
		while(n>0 || sum>9){
			if(n==0){
				n=sum;
				sum=0;
			}
			sum+=n%10;
			n/=10;
		}
		return sum;
		// throw new UnsupportedOperationException("getCodeThroughStrings(String input1)");
	}
}