package D01_23;

import java.util.ArrayList;

public class LenOfLongestSubStr {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int k=0, max=0, count=0;
        ArrayList<Character> l = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            if(l.contains(s.charAt(i))) {
                i= ++k;
                if(max<count) max=count;
                count=0;
                l.clear();
            }
            count++;
            l.add(s.charAt(i));
        }
        if(max<count) max=count;
        System.out.println(max);
    }
}
