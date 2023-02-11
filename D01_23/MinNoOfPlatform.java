package D01_23;

public class MinNoOfPlatform {
    public static void main(String[] args) {
        int[] a = { 100, 140, 150, 200, 215, 400 };
        int[] d = { 110, 300, 220, 230, 315, 600 };
        int i = 0, j = 0;
        int max = 0, count = 0;
        while (i < a.length && j < d.length) {
            if (a[i] < d[j]) {
                count++;
                i++;
                if (count > max)
                max = count;
            } else {
                j++;
                count--;
            }
        }
        System.out.println(max);
    }
}
