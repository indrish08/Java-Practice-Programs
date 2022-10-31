import java.util.Scanner;
public class SplitOddEven {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=0, y=0, n=s.nextInt();
        int[] a=new int[n], odd=new int[n], even=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even[x]=a[i];
                x++;
            }else{
                odd[y]=a[i];
                y++;
            }
        }
        System.out.println("\nOdd : ");
        for(int i=0;i<y;i++) {
            System.out.print(odd[i]+" ");
        }
        System.out.println("\n\nEven : ");
        for(int i=0;i<x;i++) {
            System.out.print(even[i]+" ");
        }
        System.out.println();
        s.close();
    }
}
