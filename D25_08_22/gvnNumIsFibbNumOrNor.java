package D25_08_22;
public class gvnNumIsFibbNumOrNor {
    public static void main(String[] args) {
        int n=34;

        int a=0, b=1, c=0;
        if(n==0||n==1){
            System.out.println(true);
            return;
        }
        for(int i=2;i<n&&c<n;i++){
            c=a+b;
            a=b;
            b=c;
            if(c==n){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}