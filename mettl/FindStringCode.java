package mettl;

public class FindStringCode {
    public static void main(String[] args) {
        String input1= "World Wide Web";
        String[] strar = input1.split(" ");
		String out="";
		int l=0, n=0, sum=0;
		for(String s:strar){
			sum=0;
			char[] tmp=s.toCharArray();
			l=tmp.length;
			n=l/2;
			for(int i=0;i<n;i++){
				sum+=Math.abs((pos(tmp[i]) - pos(tmp[l-(i+1)])));
			}
			if(l%2!=0){
				sum+=Math.abs((pos(tmp[n])));
			}
		out+=String.valueOf(sum);
		}
		// return Integer.valueOf(out);
		System.out.println(Integer.valueOf(out));
	}
	static int pos(char ch){
		if(ch>97 && ch<122){
			ch-=32;
		}
		return ch-64;
	}
}