package DSA.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
        int len = a.length;

        sort(a, 0, len - 1);

        System.out.println("Sorted Array : ");
        System.out.println(Arrays.toString(a));
    }
    
    public static void sort(int a[]){
        sort(a, 0, a.length-1);
    }

    static void sort(int a[], int beg, int end) { // beg - beginning ; end - ending
        if (beg < end) {
            int mid = beg + (end - beg) / 2;
            sort(a, beg, mid);
            sort(a, mid + 1, end);
            // System.out.println(Arrays.toString(a));
            merge(a, beg, mid, end);
        }

    }
    static void merge(int a[], int beg, int mid, int end) {
        int n1 = mid - beg + 1;
        int n2 = end - mid;
        int LeftArr[] = new int[n1];
        int RightArr[] = new int[n2];

        System.arraycopy(a, beg, LeftArr, 0, n1);
        System.arraycopy(a, mid + 1, RightArr, 0, n2);

        // System.out.println(Arrays.toString(LeftArr) + "\n" +
        // Arrays.toString(RightArr));

        int i = 0, j = 0, k = beg;

        while (i < n1 && j < n2) {
            if (LeftArr[i] < RightArr[j]) {
                a[k] = LeftArr[i];
                i++;
            } else {
                a[k] = RightArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k++] = LeftArr[i++];
        }
        while (j < n2) {
            a[k++] = RightArr[j++];
        }
        // System.out.println(Arrays.toString(a));
    }
}
