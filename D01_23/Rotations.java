package D01_23;

public class Rotations {
    public static void main(String[] args) {
        String str = "indrish";
        int res = minNoOfRotations(str);
        System.out.println(res);

        String s1 = "ABCD", s2 = "BCDA";
        boolean ans = isRotationOfAnotherStr(s1, s2);
        System.out.println(ans);
    }

    static int minNoOfRotations(String str) {
        String temp = str;
        int count = 0;
        do {
            temp = temp.substring(1) + temp.charAt(0);
            count++;
        } while (!temp.equals(str));
        return count;
    }

    static boolean isRotationOfAnotherStr(String s1, String s2) {
        int count = 0;
        while (!s1.equals(s2)) {
            s2 = s2.substring(1) + s2.charAt(0);
            System.out.println(count);
            if (++count == s2.length())
                return false;
        }
        return true;
    }
}
