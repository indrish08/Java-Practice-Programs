import java.util.Scanner;

public class primePosOfChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.toLowerCase();
        // int n=0;
        for(int i=0;i<s.length();i++){
            int n=(int) s.charAt(i) - 'a' + 1;
            if(primePosOfChar.isPrime(n)){
                System.out.println(s.charAt(i)+" - "+n);
            }
        }
        sc.close();
    }
    static boolean isPrime(int n){
        if(n==0||n==1)
            return false;
        for(int i=2;i<n/2+1;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
