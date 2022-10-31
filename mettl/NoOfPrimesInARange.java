package mettl;

public class NoOfPrimesInARange {
    public static void main(String[] args) {
        int input1=700, input2=725;
        System.out.println(countPrimesInRange(input1, input2)); //3
    }
    public static int countPrimesInRange(int input1,int input2){
		// Read only region end
		// Write code here...
		int c=0;
		boolean b;
		for(int n=input1;n<=input2;n++) {
			b=true;
			for(int i=2;i<(n/2)+1;i++) {
				if(n%i==0) {
					b=false;
					break;
				}
			}

			if(b)
			c++;
		}
		return c;
	}
}