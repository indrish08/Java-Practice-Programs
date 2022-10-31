package newPkg;

import java.util.Arrays;

public class wordsWithoutListPrgm {
    public static void main(String[] args) {
        String arstr[]={"a","bb","b","ccc"};
        int n=1;
        // System.out.println("Input  : "+Arrays.toString(arstr));
        if(n<=0){
            System.out.println("Invalid Input");
        }else{
            String tt[]=wordsWithoutList(arstr, n);
            System.out.println("Output : "+Arrays.toString(tt));
        }
    }
    public static String[] wordsWithoutList(String inp1[], int inp2) {
        String temp[]=new String[inp1.length];
        int k=0, newlen=inp1.length;
        for(int i=0;i<inp1.length;i++){
            if(inp1[i].length()==inp2){
                newlen--;
                continue;
            }
            temp[k]=inp1[i];
            k++;
        }
        String str[]=new String[newlen];
        for(int i=0;i<str.length;i++){
            str[i]=temp[i];
        }
        return str;
    }
}
