package D02_23;

import java.util.*;


public class Anagram {

    //Class Name Should Be Main
  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] s1 = sc.nextLine().trim().toLowerCase().toCharArray();
        char[] s2 = sc.nextLine().trim().toLowerCase().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(String.valueOf(s1).equals(String.valueOf(s2)))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
