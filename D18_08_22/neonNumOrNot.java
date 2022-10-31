package D18_08_22;

public class neonNumOrNot {
    public static void main(String[] args) {
        int n=9;
        int t1=0, t2=0;
        t1=n*n;
        while(t1>0){
            t2+=t1%10;
            t1/=10;
        }
        if(t2==n){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
