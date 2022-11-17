package newPkg;
import java.util.*;
public class HashMapEx {
    public static void main(String[] args) {
        String s="cdcdcdcdeeeef";
        System.out.println(gameOfThrones(s));
        
    }

    public static String gameOfThrones(String s) {
        // Write your code here
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        int[] co=new int[ch.length];
        int count=1;
        for(int i=0;i<ch.length-1;i++){
            System.out.println(ch[i]+" "+ch[i+1]);
            // System.out.println(count);
            if(ch[i]==ch[i+1]){
                count++;
            }else{
                co[i]=count;
                count=1;
            }
        }
        System.out.println(count);
        co[co.length-1]=count;
        // for(char c:ch){
        //     System.out.println(c);
        // }
        
        // int count=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(co[i]%2!=0){
                c++;
            }
            if(c>1) return "NO";
            // if(co[i]%2==0){
            //     co[i]=0;
            // }
        }
        for(int i:co){
            System.out.println(i);
        }
        // for(int i=0;i<s.length();i++){
        //     System.out.println(ch[i]+" "+co[i]);
        // }
        return "YES";
    }
}
