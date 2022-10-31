package D08_09_22;
import java.util.Scanner;
public class findPrimeInArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.print("Enter Array Elements : ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        s.close();
        System.out.println("Prime Numbers :");
        for(int i=0;i<n;i++){
            if(isPrime(a[i])){
                System.out.println(a[i]);
            }
        }
    }
    static boolean isPrime(int n){
        if(n==0||n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}