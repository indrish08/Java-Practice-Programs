package D15_10_22;

public class ConvertStrToNewCharSet {
    public static void main(String[] args) {
        String qwert="qwertyuiopasdfghjklzxcvbnm";
        String str="utta";
        String str2="";
        for(int i=0;i<str.length();i++){
            str2+=(char)(qwert.indexOf(str.charAt(i)) + 'a');
        }
        System.out.println(str2);
    }
}
