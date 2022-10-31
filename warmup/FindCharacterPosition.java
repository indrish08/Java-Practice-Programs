import java.util.Scanner;

public class FindCharacterPosition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" - "+(int)(str.charAt(i)-96));
        }
        s.close();
    }
}
