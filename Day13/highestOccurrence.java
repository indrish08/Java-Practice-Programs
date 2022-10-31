package Day13;

public class highestOccurrence {

	public static void main(String[] args) {
		String str= "Great responsibility";
		int h=0, count=0,len=str.length();
		int c[] = new int[len];
		for(int i=0;i<len;i++) {
			count=1;
			for(int j=i+1;j<len;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					c[j]=-1;
				}
			}
			if(c[i]!=-1) {
				c[i]=count;
			}
			if(c[i]>=1) {
				System.out.println(str.charAt(i) + " is repeated " + c[i] + " time.");
			}
		}
		for(int i=0;i<len;i++) {
				if(h<c[i]) {
					h=i;
				}
		}
		System.out.println();
		System.out.println("The chareacter '"+str.charAt(h)+"' ("+c[h]+") has the highest number of occurrence.");
	}

}
