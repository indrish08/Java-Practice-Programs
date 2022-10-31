package D19_08_22;
import java.util.*;
public class sumBtwnTwoIndexPos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int arr[]={23,3,5,8,42,10,62,75};
        int arr[]={3,-6,7,-10,6,-8};
        System.out.print("Enter the positions : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
