package D27_08_22;
public class ceaserCipher {
    public static void main(String[] args) {
        String str="Welcome";
        int key=10;
        for(int i=0;i<str.length();i++){
            System.out.print(ceaser(str.charAt(i), key)); //Govmywo
        }
    }
    static char ceaser(char ch, int n){
        while(n!=0){
            if(ch==90||ch==122){
                ch-=25;
            }else{
                ch+=1;
            }
            n--;
        }
        return ch;
    }
}