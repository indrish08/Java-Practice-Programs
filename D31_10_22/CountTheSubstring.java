package D31_10_22;
import java.util.ArrayList;
public class CountTheSubstring {
    public static void main(String[] args) {
        String str="mania";
        char key='m';
        int count=0;
        ArrayList<String> arr=new ArrayList<>();
        for(int j=2;j<=str.length();j++){
            int n=j;
            int len=str.length()-(n-1);
            for(int i=0;i<len;i++){
                System.out.println(str.substring(i, n));
                arr.add(str.substring(i, n++));
            }
        }
        for(String s : arr){
            if(s.contains(String.valueOf(key))){
                count++;
            }
        }
        System.out.println("\n"+count);
    }
}
