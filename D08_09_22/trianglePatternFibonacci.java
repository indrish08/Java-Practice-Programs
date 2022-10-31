package D08_09_22;
public class trianglePatternFibonacci {
    public static void main(String[] args) {
        int a=0,b=1,c=0,n=5;
        int t=n-1;
        for(int i=1;i<=n;i++){
            // System.out.println("t = "+t);
            for(int k=0;k<t;k++){
                System.out.print(" ");
            }
            t--;
            for(int j=1;j<=i;j++){
                if(i==1){
                    System.out.print(a);
                }else if(i==2&&j==1){
                    System.out.print(b+" ");
                }else{
                    c=a+b;
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                }
            }
            System.out.println();
        }
    }
}