package D15_10_22;

public class SplitCharWithN_Dash {
    public static void main(String[] args) {
        String str="2-5g-3-J";
        str=str.toUpperCase();
        int n=2;
        String str2="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='-'){
                str2+=str.charAt(i);
            }
        }
        str="";
        System.out.println(str2);
        str+=str2.substring(0, n);
        for(int i=n;i<=str2.length();i+=n){
            if((i+n)<=str2.length()){
                str+="-"+str2.substring(i, i+n);
            }else{
                str+="-"+str2.substring(i);
            }
        }
        System.out.println(str);
    }
}
