package NewMail;

import java.util.*;

public class prgm1 {
    private static Scanner s;
    public static void main(String[] args) {
        s = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String str = s.nextLine(); // "AFAAW";
        System.out.print("Enter String 2 : ");
        String str2 = s.nextLine(); // "BGFFB";
        str = removeRepeated(str);
        str2 = removeRepeated(str2);
        String str3 = str + str2;
        str3 = unique(str3);
        System.out.println("\nOutput : " + str3);
    }

    private static String removeRepeated(String str) {
        int n;
        String str2 = "";
        str2 += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            n = 0;
            for (int j = 0; j < str2.length(); j++) {
                if (str.charAt(i) == str2.charAt(j)) {
                    n = 1;
                    break;
                }
            }
            if (n == 0) {
                str2 += str.charAt(i);
            }
        }
        return str2;
    }

    private static String unique(String str) {
        int n, a[] = new int[str.length()];
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            n = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    a[j] = -1;
                    n++;
                }
            }
            if (a[i] != -1) {
                a[i] = n;
            }
            if (a[i] == 1) {
                str2 += str.charAt(i);
            }
        }
        return str2;
    }
}
