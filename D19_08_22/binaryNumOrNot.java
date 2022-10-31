package D19_08_22;
import java.util.Scanner;
public class binaryNumOrNot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        s.close();
        // int n=1001101;
        System.out.println(n);
        while(n>0){
            if(!(n%10==0 || n%10==1)){
                System.out.println(false);;
                return;
            }
            n/=10;
        }
        System.out.println(true);
    }
}