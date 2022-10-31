package mettl;

public class GenerateSeriesFindNth {
    public static void main(String[] args) {
        int a=1,
            b=3,
            c=6,
            N=17;
        int n = seriesN(a,b,c,N);
        System.out.println(n); //res : 41
    }
    static int seriesN(int input1, int input2, int input3, int input4){
        int d1=input2-input1,
		d2=input3-input2, 
		n=input3;
		for(int i=4;i<=input4;i++){
			if(i%2==0){
				n+=d1;
			}else{
				n+=d2;
			}
		}
		return n;
	}
}
