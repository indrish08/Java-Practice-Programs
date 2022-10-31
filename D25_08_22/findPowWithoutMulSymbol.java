package D25_08_22;

public class findPowWithoutMulSymbol {
    public static void main(String[] args) {
        int n=3, p=12;
        System.out.println("User-Defined :"+pow(n,p));
        System.out.println("Pre-Defined  :"+Math.pow(n,p));
    }

    static int pow(int n, int p){
        int t=n, sum=0;
        for(int i=2;i<=p;i++){
            for(int j=0;j<n;j++){
                sum+=t;
            }
            t=sum;sum=0;
        }
        return t;
    }
}
