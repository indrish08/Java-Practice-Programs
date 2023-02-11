package D02_23;

public class MaximumValuesInEachSubarray {
    public static void main(String[] args) {
        int[] a = { 10, 5, 2, 7, 8, 7 };
        int k = 3;
        for (int i = k - 1; i < a.length; i++) {
            int out = maxNum(a, i - k + 1, i);
            System.out.println(out);
        }
    }

    static int maxNum(int[] a, int start, int end) {

        int max = 0;
        for (int i = start; i <= end; i++) {
            if (max < a[i])
                max = a[i];
        }
        return max;
    }
}
