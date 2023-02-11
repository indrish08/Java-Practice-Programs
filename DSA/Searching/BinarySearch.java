package DSA.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        
    }
    public static int search(int[] a, int k){
        return search(a, k, 0, a.length-1);
    }
    static int search(int[] a, int k,int low, int high){
        if(low<=high){
            int mid = low + (high-low) / 2;
            if(k==a[mid]) 
                return mid;
            else if (k > a[mid])
                return search(a, k, mid+1, high);
            else
                return search(a, k, low, mid-1);
        }
        else
            return -1;
    }
}
