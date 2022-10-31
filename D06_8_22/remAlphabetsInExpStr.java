package D06_8_22;

public class remAlphabetsInExpStr {
    public static void main(String[] args) {
        String str="g+abc*ty-56";
        String str2="";
        for(int i=0;i<str.length();i++){
            if(!Character.isAlphabetic(str.charAt(i))){
                str2+=str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}