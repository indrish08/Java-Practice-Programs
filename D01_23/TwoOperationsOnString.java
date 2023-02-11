package D01_23;

import java.util.*;

public class TwoOperationsOnString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Welcome";
        int opt1 = 0;
        int opt2 = 0;
        StringBuilder s = new StringBuilder();
        if (opt1 == 0) {
            for (int i = 0; i < s1.length(); i++)
                if (s2.contains("" + s1.charAt(i)))
                    s.append(s1.charAt(i));
            for (int i = 0; i < s2.length(); i++)
                if (s1.contains("" + s2.charAt(i)))
                    s.append(s2.charAt(i));
        } else if (opt1 == 1) {
            for (int i = 0; i < s1.length(); i++)
                if (!s2.contains("" + s1.charAt(i)))
                    s.append(s1.charAt(i));
            for (int i = 0; i < s2.length(); i++)
                if (!s1.contains("" + s2.charAt(i)))
                    s.append(s2.charAt(i));
        }
        String out = "";
        if (opt2 == 0)
            out = s.toString().toLowerCase();
        else if (opt2 == 1)
            out = s.toString().toUpperCase();

        System.out.println(out);
    }
}
