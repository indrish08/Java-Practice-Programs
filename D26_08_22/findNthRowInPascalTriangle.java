package D26_08_22;
public class findNthRowInPascalTriangle {
    public static void main(String[] args) {
        int n=1331;
        for(int i=0;i<=100;i++){
            int t=0;
            for(int j=0;j<=i;j++){
                t=(t*10)+fact(i)/(fact(i-j)*fact(j));
            }
            if(n==t){
                System.out.println(i);
                break;
            }
        }
    }
    static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
}
