package D08_09_22;
import java.util.Scanner;
public class findSubArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int n=s.nextInt();
        int[] a=new int[n];
        int[] a2=new int[3];
        System.out.print("Enter Array Elements : ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.print("Enter Second Array Elements : ");
        for(int i=0;i<3;i++){
            a2[i]=s.nextInt();
        }
        s.close();
        for(int i=0;i<3;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(a2[i]==a[j]){
                    c++;
                }
            }
            if(c==0){
                System.out.println("Not a Sub Array");
                return;
            }
        }
        System.out.println("Sub Array");
    }
}
