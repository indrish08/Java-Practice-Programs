package newPkg;

public class sumitStringOrNot {
    public static void main(String[] args) {
        String str="cbcbc";
        int n, len=str.length();
        int a[]=new int[len];
        for(int i=0;i<len;i++){
            a[i]=str.charAt(i);
        }
        Boolean b=false;
        for(int i=0;i<len-1;i++){
            n=a[i]-a[i+1];
            n=Math.abs(n);
            if(n==1 || n==25){
                b=true;
            }else{
                b=false;
                break;
            }
        }
        if(b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
