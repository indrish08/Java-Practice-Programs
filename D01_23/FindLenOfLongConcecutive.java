package D01_23;

import DSA.Sorting.*;

public class FindLenOfLongConcecutive {
    public static void main(String[] args) {
        int a[] = { 49, 1, 3, 200, 2, 4, 70, 5 };
        MergeSort.sort(a);
        int count = 1, max = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] == 1) {
                count++;
            } else {
                if (max < count)
                    max = count;
                count = 1;
            }
        }
        if (max < count)
            max = count;
        System.out.println(max);

    }
}
