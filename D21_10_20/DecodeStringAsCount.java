package D21_10_20;

public class DecodeStringAsCount {
    public static void main(String[] args){
        String str="3[b2[ca]]";
        while(str.contains("[")){
            int in=str.lastIndexOf("[");
            for(int i=in;i<str.length();i++){
                if(str.charAt(i)==']'){
                    System.out.println(str.charAt(in-1)+" "+str.substring(in+1, i));
                    String s=decodeStr((int)(str.charAt(in-1)-'0'), str.substring(in+1, i));
                    str=str.substring(0, in-1)+s+str.substring(i+1);
                    break;
                }
            }
        }
        System.out.println("\nOutput : "+str);
    }
    static String decodeStr(int n, String s){
        String str="";
        while(n-->0){
            str+=s;
        }
        return str;
    }
}
