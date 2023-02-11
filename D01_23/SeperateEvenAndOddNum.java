package D01_23;

import java.util.Arrays;

public class SeperateEvenAndOddNum {
    public static void main(String[] args) {
        int a[] = { 20, 12, 23, 17, 7, 8, 10, 2, 1, 0 };
        int temp=0;
        
        int i=0, j=a.length-1;
        while(i++ < j){
            if(a[i]%2!=0){
                while(a[j]%2!=0)
                    j--;
                if(i<j){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }
}
