package D26_08_22;

public class remConsecDuplicateChar {
    public static void main(String[] args) {
        String s="abbbccdeefkf", s2="";
        boolean b=true;
        for(int i=0;i<s.length();i++){
            if(i!=s.length()-1&&s.charAt(i)==s.charAt(i+1)){
                b=false;
            }else if(i!=0&&s.charAt(i-1)!=s.charAt(i)){
                b=true;
            }
            if(b){
                s2+=s.charAt(i);
            }
        }
        System.out.println(s2);
    }
}