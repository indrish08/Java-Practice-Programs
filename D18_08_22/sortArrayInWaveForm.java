package D18_08_22;
import java.util.*;
public class sortArrayInWaveForm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // System.out.print("Enter the Size of Array : ");
        // int n= s.nextInt();
        // int arr[]=new int[n];
        // System.out.println("ENter Array Elements : ");
        // for(int i=0;i<n;i++){
        //     arr[i]=s.nextInt();
        // }
        int arr[]={24,5,2,67,54,10,34};
        int n=arr.length;
        s.close();
        int t=0;
        for(int i=0;i<n;i++){      //Sorting
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(int i=0;i<n-1;i+=2){   // Swapping
            t=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
