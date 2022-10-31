package newPkg;

public class replaceLetterWithNextLetter {
    public static void main(String[] args) {
        String str="hello";
        String str2="";

        for(int i=0;i<str.length();i++){
            str2+=replaceChar(str.charAt(i));     
        }
        System.out.println(str2);
    }

    
    public static char replaceChar(char ch) {
        String vowels="aeiou";
        if(ch>=65 && ch<=90){
            ch= (char) (ch+32);
        }
        if(ch>=97 && ch<=121){
            ch=(char) (ch+1);
        }
        for(int i=0;i<vowels.length();i++){
            if(ch==vowels.charAt(i)){
                ch=(char) (ch-32);
                break;
            }
        }

        return ch;
    }
    
}
