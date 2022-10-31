package D21_10_20;
import java.util.Arrays;
public class FindTheSmallestIntValue {
    public static void main(String[] args) {
        // int[] arr={15,10,3,11,6,1};
        int[] arr={1,2,6,7,3};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int n=arr[i]+arr[j];
                if(!contains(arr,n)){
                    System.out.println(n);
                    return;
                }
            }
        }
    }
    static void sort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    a[i]+=a[j];
                    a[j]=a[i]-a[j];
                    a[i]-=a[j];
                }
            }
        }
    }
    static boolean contains(int[] a, int n){
        for(int i : a){
            if(i==n) return true;
        }
        return false;
    }
}
