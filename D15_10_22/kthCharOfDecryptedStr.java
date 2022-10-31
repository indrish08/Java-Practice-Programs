package D15_10_22;
import java.util.Scanner;
public class kthCharOfDecryptedStr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Input String : ");
        String str=s.nextLine(); //"ab4c2ed3";
        System.out.print("Input Key    : ");
        int key=s.nextInt();
        String[] alp=str.split("[^a-z]");
        int[] num = new int[alp.length];
        int k=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                num[k++]=(int)((str.charAt(i)) - '0');
            }
        }
        String decrptedStr="";
        for(int i=0;i<alp.length;i++){
            for(int j=0;j<num[i];j++){
                decrptedStr+=alp[i];
            }
        }
        System.out.println("\nOutput           : "+decrptedStr.charAt(key-1));
        System.out.println("Decrypted String : "+decrptedStr);
        s.close();
    }
}
