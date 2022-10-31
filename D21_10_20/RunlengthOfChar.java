package D21_10_20;

public class RunlengthOfChar {
    public static void main(String[] args) {
        String str="wwwwaaadexxxxxx";
        String s2="";
        int count=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                s2+=str.charAt(i)+String.valueOf(count);
                count=1;
            }
        }
        s2+=str.charAt(str.length()-1)+String.valueOf(count);
        System.out.println(s2);
    }
}
